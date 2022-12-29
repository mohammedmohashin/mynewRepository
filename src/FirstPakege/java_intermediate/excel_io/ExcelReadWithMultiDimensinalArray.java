package src.FirstPakege.java_intermediate.excel_io;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReadWithMultiDimensinalArray {
    public static void main(String[] args) {
        import XSSFCell;
        import XSSFRow;
        import XSSFSheet;
        import XSSFWorkbook;


        import FileInputStream;
        import IOException;

        public class ReadExcelWithDiffDataType{
            public static void main(String[] args) {

                String path = "C:\\users\\moha\\documents\\moha\\Java-oct-22\\Excel files\\Data.xlsx";
                 String mySheetpath = "sheet";

                 try{

                     fileInputStream fis = new fileInputeStrem(path);
                     XSSFWorkbook workbook = new XSSFWorkbook(fis);

                     XSSFSheet sheet = workbook.getSheet(mySheetpath);

                     int myRow = sheet.getLastRowNum()+1;
                     int myCol = sheet.getRow(0).getLastCellNum();

                     for (int r =0; r <myRow; r++){

                         XSSFRow readRow = sheet.getRow(r);
                         for( int c = 0; c <myCol; c++){

                             //String value = readRow.getCell(c).tostring();

                             XSSFCell readCell = readRow.getCell(c);

                             switch (readCell.getCellType()){
                                 case STRING: System.out.print(readCell.getStringCellValue() +"\t\");
                                         break;

                                 case NUMERIC:

                                     System.out.print(readCell.getNumericCellValue()+"\t\t");
                                      break;
                                 case BOOLEAN:
                                     System.out.print(readCell.getBooleanCellValue() +"\t\t");
                                     break
                                 default:
                                     System.out.println("value is not readable");{


                                 }

                                     System.out.println();{


                                 }catch (IOException e){

                                     System.out.println(e.getMessage);
                                 }







