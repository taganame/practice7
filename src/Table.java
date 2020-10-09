public class Table extends Furniture{
    private String TableType;
    Table(){}
    Table(int weight,String ManufacturedBy,String TableType){
        super(weight,ManufacturedBy);
        this.TableType=TableType;
    }

    public String getTableType() {
        return TableType;
    }

    public void setTableType(String tableType) {
        TableType = tableType;
    }

    @Override
    public String toString() {
        return "Table{" +
                "TableType='" + TableType + '\'' +
                ", " + super.toString();
    }
}
