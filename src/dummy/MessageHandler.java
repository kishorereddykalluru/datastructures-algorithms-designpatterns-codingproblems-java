package dummy;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class MessageHandler extends DefaultHandler {

    String msgId;
    String vendor;

    List<XMLRecord> records;
    XMLRecord record;

    int tidCount = 0;

    String currentValue;

    public MessageHandler(){
        records = new ArrayList<XMLRecord>();
        currentValue = "";
        record = new XMLRecord();
        record.setTableId("NULL");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        String jobName = attributes.getValue("", "jobName");
        if(jobName != null){
            record = new XMLRecord();
            record.setTableId(qName);
            record.setVendor(vendor);
            record.setSequence(Integer.valueOf(attributes.getValue("", "sequence").trim()));
            record.setOperation(attributes.getValue("", "operation").trim());
            if(attributes.getValue("", "exportId") != null ){
                record.setExportId(Integer.valueOf(attributes.getValue("", "exportId")));
            }
        }

        if(qName.equals(record.getTableId())){
            tidCount++;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        currentValue += new String(ch, start, length).trim();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("msgId")){
            msgId = currentValue;
        }
        if(qName.equals("vendor")){
            vendor = currentValue;
        }

        if(qName.equals(record.getTableId())){
            tidCount--;
            if(tidCount == 0){
                records.add(record);
            }
        }

        if(tidCount > 0){
            record.addColumn(qName, currentValue);
        }

        currentValue = "";
    }

    public String getMsgId() {
        return msgId;
    }

    public String getVendor() {
        return vendor;
    }

    public List<XMLRecord> getRecords() {
        return records;
    }
}
