package dummy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class XMLRecord implements Comparable<XMLRecord>{

    private String vendor;
    private String tableId;
    private Integer sequence;
    private Integer exportId;
    private String operation;
    private Map<String, String> columns;
    private Integer retries;

    public XMLRecord(){
        columns = new HashMap<>();
        sequence = 0;
        exportId = -1;
        retries = 0;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getExportId() {
        return exportId;
    }

    public void setExportId(Integer exportId) {
        this.exportId = exportId;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Map<String, String> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, String> columns) {
        this.columns = columns;
    }

    public void addColumn(String columnName, String value){
        columns.put(columnName, value);
    }

    public String getColumnValue(String columnId){
        return columns.get(columnId);
    }

    public Integer getRetries() {
        return retries;
    }

    public void incrementRetries() {
        retries++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XMLRecord xmlRecord = (XMLRecord) o;
        return tableId.equals(xmlRecord.tableId) && sequence.equals(xmlRecord.sequence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId, sequence);
    }

    @Override
    public int compareTo(XMLRecord o) {
        if(tableId.compareTo(o.getTableId()) != 0){
            return tableId.compareTo(o.getTableId());
        }
        return sequence.compareTo(o.getSequence());
    }

    @Override
    public String toString() {
        return "XMLRecord{" +
                "vendor='" + vendor + '\'' +
                ", tableId='" + tableId + '\'' +
                ", sequence=" + sequence +
                ", exportId=" + exportId +
                ", operation='" + operation + '\'' +
                ", columns=" + columns +
                ", retries=" + retries +
                '}';
    }
}
