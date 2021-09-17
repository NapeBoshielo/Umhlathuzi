package co.za.umhlathuzi.Utilities;

import co.za.umhlathuzi.Base.TestBase;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Utils extends TestBase {
    public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 20;

    public static String TestData_sheet_path = "/home/nape/IdeaProjects/uMhlathuziAutomationtesting/src/main/resources/uMhlathuzeTestData.xlsx";
  public static  XSSFWorkbook workbook;
  public static  XSSFSheet sheet;

@DataProvider(name = "TestData")
public static Object[][] getTestData(String sheetName) {

    try {
        FileInputStream  file = new FileInputStream(TestData_sheet_path);
        workbook = new XSSFWorkbook(file);
        sheet = workbook.getSheet(sheetName);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    Object[][] datas = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

    for (int i = 0; i < sheet.getLastRowNum(); i++) {
        for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
            datas[i][k] = sheet.getRow(i + 1).getCell(k).toString();

        }
    }
    return datas;
}}


































//
//
//  int rows = sheet.getLastRowNum();
//
//    for (int i =1;i<rows;i++){
//
//String data0 = sheet.getRow(0).getCell(i).getStringCellValue();





























//give excelsheet path
/*


public static String TESTDATA_SHEET_PATH = "/Users/naveenkhunteta/Documents/workspace"
 + "/FreeCRMTest/src/main/java/com/crm/qa/testdata/FreeCrmTestData.xlsx";

static Workbook book;
static Sheet sheet;
static JavascriptExecutor js;

public void switchToFrame() {
 driver.switchTo().frame("mainpanel");
}

public static Object[][] getTestData(String sheetName) {
 FileInputStream file = null;
 try {
 file = new FileInputStream(TESTDATA_SHEET_PATH);
 } catch (FileNotFoundException e) {
 e.printStackTrace();
 }
 try {
 book = WorkbookFactory.create(file);
 } catch (InvalidFormatException e) {
 e.printStackTrace();
 } catch (IOException e) {
 e.printStackTrace();
 }
 sheet = book.getSheet(sheetName);
 Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
 // System.out.println(sheet.getLastRowNum() + "--------" +
 // sheet.getRow(0).getLastCellNum());
 for (int i = 0; i < sheet.getLastRowNum(); i++) {
 for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
 data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
 // System.out.println(data[i][j]);
 }
 }
 return data;
package co.za.umhlathuzi.Utilities;

import co.za.umhlathuzi.Base.TestBase;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class Utils extends TestBase {
    public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 20;

    public static String TestData_sheet_path = "/home/nape/Documents/uMhlathuzeTestData.xlsx";
    XSSFWorkbook workbook;
    XSSFSheet sheet;

//@DataProvider(name = "TestData")
public void Utils() {


    //Readfile
    FileInputStream fis = null;
    try {
        fis = new FileInputStream(TestData_sheet_path);
        //Readbook
        workbook = new XSSFWorkbook(fis);

    } catch (Exception e) {
        e.printStackTrace();
    }


}

public String getdata(String sheet1,int rows,int col) {

    String data = sheet.getRow(0).getCell(col).getStringCellValue();
    return data;
}
}




















//
//
//  int rows = sheet.getLastRowNum();
//
//    for (int i =1;i<rows;i++){
//
//String data0 = sheet.getRow(0).getCell(i).getStringCellValue();





























//give excelsheet path
/*


public static String TESTDATA_SHEET_PATH = "/Users/naveenkhunteta/Documents/workspace"
 + "/FreeCRMTest/src/main/java/com/crm/qa/testdata/FreeCrmTestData.xlsx";

static Workbook book;
static Sheet sheet;
static JavascriptExecutor js;

public void switchToFrame() {
 driver.switchTo().frame("mainpanel");
}

public static Object[][] getTestData(String sheetName) {
 FileInputStream file = null;
 try {
 file = new FileInputStream(TESTDATA_SHEET_PATH);
 } catch (FileNotFoundException e) {
 e.printStackTrace();
 }
 try {
 book = WorkbookFactory.create(file);
 } catch (InvalidFormatException e) {
 e.printStackTrace();
 } catch (IOException e) {
 e.printStackTrace();
 }
 sheet = book.getSheet(sheetName);
 Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
 // System.out.println(sheet.getLastRowNum() + "--------" +
 // sheet.getRow(0).getLastCellNum());
 for (int i = 0; i < sheet.getLastRowNum(); i++) {
 for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
 data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
 // System.out.println(data[i][j]);
 }
 }
 return data;

 */


