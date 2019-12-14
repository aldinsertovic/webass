package service;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;


public class XMLSource {

    public String getTranslation(String original) throws Exception {
        Document doc;
        try {
            doc = readData();
            XPathFactory xpf = XPathFactory.newInstance();
            XPath xp = xpf.newXPath();
            XPathExpression xpe = xp.compile("/translation/word/russian[../english"
                    + "/text()='" + original + "'] ");
            String translated = (String) xpe.evaluate(doc, XPathConstants.STRING);

            if ("".equals(translated)) {
                return " Rijec ne postoji u rjecniku!!";
            }

            return translated;
        } catch (Exception ex) {
            Logger.getLogger(XMLSource.class.getName()).log(Level.SEVERE, null, ex);
            return "Error";
        }
        
        
        
    }

    private Document readData() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        File xmlFile = new File("C:\\Users\\HP\\Documents\\NetBeansProjects\\WebAssignment\\src\\java\\service\\translation.xml");/*ukucati apsolutnu putanju kao u primjeru*/

        return (Document) db.parse(new FileInputStream(xmlFile));
    }
}
