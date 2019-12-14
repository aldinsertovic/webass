package service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class DictionaryConverter {

    public String translate(@WebParam(name = "word") String word,
            @WebParam(name = "originalLanguage") String originalLanguage,
            @WebParam(name = "targetLanguage") String targetLanguage) throws Exception {
        XMLSource dataSource = new XMLSource();
        return dataSource.getTranslation(word);
    }

}
