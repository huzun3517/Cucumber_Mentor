package ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelMain {

  static String projectPath;
   static XSSFWorkbook workbook ;
   static XSSFSheet sheet;

    public ExcelMain(String excelPath,String sheetName) {
        //projectPath=System.getProperty("user.dir");
        try {
            workbook = new XSSFWorkbook(excelPath);
            sheet=workbook.getSheet(sheetName);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

//    public static void main(String[] args) {
//        getRowCount();
//        getCellDataString(0,0);
//        getCellDataNumber(1,1);
//
//    }



    public  void getRowCount(){



                int rowCount=sheet.getPhysicalNumberOfRows();
                System.out.println("Number of rows "+ rowCount);

        }



    public  void getCellDataString(int rowNum,int colNum){

             String cellData=   sheet.getRow(rowNum).getCell(colNum).getStringCellValue();


                System.out.println(cellData);


    }


    public  void getCellDataNumber(int rowNum,int colNum){


                double cellData=   sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

                System.out.println(cellData);


    }

}
