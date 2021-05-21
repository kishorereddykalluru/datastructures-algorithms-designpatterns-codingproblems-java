package dummy;

public class TableDef {

    private String tableId;
    private String tableGroup;

    public TableDef(String tableId, String tableGroup) {
        this.tableId = tableId;
        this.tableGroup = tableGroup;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getTableGroup() {
        return tableGroup;
    }

    public void setTableGroup(String tableGroup) {
        this.tableGroup = tableGroup;
    }
}
