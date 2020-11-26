package ApachePOI;

public class ExcelDemo {
    public static void main(String[] args) {

        String excelPath="src/main/resources/Data.xlsx";
        String sheetName="Sheet1";
        ExcelMain excel=new ExcelMain(excelPath,sheetName);
        excel.getRowCount();
        excel.getCellDataNumber(1,1);
        excel.getCellDataString(0,0);
    }
}
