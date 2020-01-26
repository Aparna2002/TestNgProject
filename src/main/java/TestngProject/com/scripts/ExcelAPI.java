package TestngProject.com.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAPI {

   FileInputStream fis=null;
   FileOutputStream fos=null;
  public  static XSSFWorkbook workbook=null;
  public static XSSFSheet sheet=null;
    public static XSSFRow row = null;
   public static XSSFCell cell = null;
   String xfilepath;
   
    public  ExcelAPI(String xfilepath) throws IOException {

    this.xfilepath=xfilepath;
      fis=new FileInputStream(xfilepath);
      workbook=new XSSFWorkbook(fis);
      fis.close();
		
	}
    public static int getRowCount(String SheetName) {
    	sheet=workbook.getSheet(SheetName);
    	int rowCount = sheet.getLastRowNum()+1;
    	return rowCount;
    }
    public static int getCellCount(String SheetName) {
    	sheet=workbook.getSheet(SheetName);
    	row=sheet.getRow(0);
    	int columeCount = row.getLastCellNum();
    	return columeCount;
    		
    }
    




}
