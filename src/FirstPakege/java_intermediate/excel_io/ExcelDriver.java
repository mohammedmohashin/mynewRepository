package src.FirstPakege.java_intermediate.excel_io;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import static org.bouncycastle.asn1.x500.style.BCStyle.O;

public class ExcelDriver {

    String value =

            myRow.getCell(b).tostring();//tostring is a genric term we could use for integer, boolean,char etc.

            System.out.println(value + "\t\");

           import org.apache.poi.xssf.usermodel.'xssFRow';

            import org.apache.poi.xssf.usermodel.'xssFsheet';

            import org.apache.poi.xssf.usermodel.'xssFworkbook';


            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.IOException;

            public class ExcelWithMultiDimArry{

            public static void main(String[] args) {

                String path =
           //"C:\\users\\moha\\Documents\\Java-oct -22\\Excel file\\data.xlsx";
           String 'mysheetpath' = "sheet1";

                try{
                    'fileInputstream' 'fis' = new 'fileInputstream'(path);
                    XSSFWorkbook workbook = new XSSFWorkbook(fis);
                    XSSFSheet sheet = workbook.getSheet('mysheetpath');
                    int myRow = sheet.getLastRowNum(0)+1;

                    int myClumns =
                            Sheet.getRow(O).getLastCellNum();

                          String [][] rowCol = new String[myRow][myClumns];

                            for (int r = 0; r <myRow; r++){

                                XSSFRow xRow = sheet.getRow(r);

                                for (int c = 0; c <myClumns; c++){
                                    String value = xRow.getCell(c).toString();
                                    rowCol[r][c] = value;
                                    System.out.println(rowCol [r][c] + "\t\t");

                                    System.out.println();

                                    workbook.close();
                                    fis.close();


                                }catch ('fileNotFoundException e'){
                                    System.out.println(e.getMessage);


                                }catch(IOException e){

                                }
                                System.out.println(e.getMessage);

                                    import org.apache.poi.ss.usermodel.Cell;
                                    import org.apache.poi.xssf.usermodel.XSSFRow;
                                    import org.apache.poi.xssf.usermodel.XSSFSheet;
                                    import org.apache.poi.xssf.usermodel.XSSFWorkbook;



                                    import Object FileOutputStream;
                                FileOutputStream;
                                    import java.io.IOException;
                                    import java.util. Map;
                                    import java.util.Map;
                                    import java.util.TreeMap;

                                    public class Excelwrite{

                                    }
                                        public static void main (String[]args)throw
                                        IOException{

                                        XSSFWorkbook workbook = new XSSFWorkbook();

                                    XSSFSheet sheet1 = 'woorkbook'.createsheet("data");

                                    Map<String, Object[]> data = new TreeMap<>();
                                    data.put("1",new Object[]{"ID","Name","states"});
                                    data.put("2",new Object[]{"100","RUal","NY"});
                                    data.put("3" new Object[]{"101","Sarah","NJ"});

                                    set<String> keyid =data.'keyset'();

                                    int rowid =0;

                                    for (String key:keyid){

                                        XSSFRow row = sheet.createRow(rowid++);

                                        Object[] objectsArr = data.get(key);

                                        int cellid =0;

                                        for ('object''obj' : 'ObjectArr'){

                                            cell cell = row.createCell(cellid++);
                                            cell.'setCcllvalue'((String)('obj'));



                                            fileOutputStream out = new FileOutputStream("C:\\user\\moha\\documents\\moha\\Java-oct-22\\Excel files\\output\\data.xlsx");

                                            workbook.write(out);

                                            out.close();

                                        }
                                    }




                                }
                                    }

                                }

                                }










