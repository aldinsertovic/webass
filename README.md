# webass
Web service for translating between two languages. On the service, the word database is stored in a single xml file.
When a client requires a specific translation word, the service checks for the existence of the word in its XML database.
If a word exists, the service outputs the translated word to the client.
If the word does not exist in the XML file, the service sends an adequate message.
The user uses the described service by calling the translate method, with three string parameters.
The first parameter represents the translation word, the second parameter is the source language, and the third is the target language.
I also used a Glassfish server in this case.
How to get started:

1. I inserted three words into the XML file in two languages (english and russian)
(Happy, Schastlivyy), (working, rabotayet), (butterfly, babochka)
2. In the XMLSource class for the translate.xml file path where the word data is stored, it is necessary to define, type the absolute path where that folder is located.
In my case, this is located in the WebAssignment project folder
3. Do Clean & Build, then do deploy applications, in my case it was on Glassfish server.
4. Then I opened localhost: 4848 on my web browser and entered the Glassfish server system, then went to Application and selected my WebAssignment application within that section.
5. Afterwards, I opened View EndPoint and then clicked the tester link, where it dropped two test links.

That would be brief about the steps.
Thank you for your understanding.
