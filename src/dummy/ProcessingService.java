package dummy;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProcessingService {

    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser saxParser = factory.newSAXParser();

    public ProcessingService() throws ParserConfigurationException, SAXException {
    }


    public MessageHandler parseMessage(String message) throws IOException, SAXException {
        MessageHandler handler = new MessageHandler();
        saxParser.parse(new ByteArrayInputStream(message.getBytes()), handler);
        return handler;
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        String xml = getXml();

        ProcessingService service = new ProcessingService();

        MessageHandler handler = service.parseMessage(xml);

        List<XMLRecord> xmlRecords = new ArrayList<>(handler.getRecords());

        System.out.println("xmlRecords = " + xmlRecords);

        //xmlRecords.forEach(System.out::println);

        Map<String, String> columns = xmlRecords.get(0).getColumns();
        
        String str = columns.get("break");
        System.out.println("str = " + str.length());
        columns.forEach((k, v)->{
            System.out.print("k = " + k);
            System.out.println("\tv = " + v);
        });
    }

    private static String getXml() {

        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<refDataCupAlternativePrice>\n" +
                "\t<header>\n" +
                "\t\t<request>\n" +
                "\t\t\t<msgId>ABC</msgId>\n" +
                "\t\t\t<vendor>PIMCO_CUP_ALTERNATE_PRICE</vendor>\n" +
                "\t\t\t<msgCreatedDate>2020-11-04T16:15:55.203</msgCreatedDate>\n" +
                "\t\t</request>\n" +
                "\t</header>\n" +
                "\t<body>\n" +
                "\t\t<cupAlternatePrice sequence=\"819\" operation=\"CREATE_OR_UPDATE\" jobName=\"EDM_CUP_Repo_Update\" exportId = \"123456\">\n" +
                "\t\t\t<source>P</source>\n" +
                "\t\t\t<brokerId>BRC</brokerId>\n" +
                "\t\t\t<cusip>AR2107646</cusip>\n" +
                "\t\t\t<price>108.500</price>\n" +
                "\t\t\t<break>\n" +
                "\t\t\t\t<need>one</need>\n" +
                "\t\t\t\t<very>much</very>\n" +
                "\t\t\t</break>\n" +
                "\t\t</cupAlternatePrice>\n" +
                "\t\t<cupAlternatePrice sequence=\"820\" operation=\"CREATE\" jobName=\"EDM_CUP_Repo_Update\" exportId = \"123457\">\n" +
                "\t\t\t<source>P</source>\n" +
                "\t\t\t<brokerId>BRC</brokerId>\n" +
                "\t\t\t<cusip>AR21076462</cusip>\n" +
                "\t\t\t<price>108.500</price>\n" +
                "\t\t\t<break>\n" +
                "\t\t\t\t<need>one</need>\n" +
                "\t\t\t\t<very>much</very>\n" +
                "\t\t\t</break>\n" +
                "\t\t</cupAlternatePrice>\n" +
                "\t\t<cupAlternatePrice sequence=\"821\" operation=\"UPDATE\" jobName=\"EDM_CUP_Repo_Update\" exportId = \"123458\">\n" +
                "\t\t\t<source>P</source>\n" +
                "\t\t\t<brokerId>BRC</brokerId>\n" +
                "\t\t\t<cusip>AR21076461</cusip>\n" +
                "\t\t\t<price>108.500</price>\n" +
                "\t\t\t<break>\n" +
                "\t\t\t\t<need>one</need>\n" +
                "\t\t\t\t<very>much</very>\n" +
                "\t\t\t</break>\n" +
                "\t\t</cupAlternatePrice>\n" +
                "\t</body>\n" +
                "</refDataCupAlternativePrice>";
    }
}