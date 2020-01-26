package TestngProject.com.scripts;

import java.awt.Window;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataManuplations_001 {

	public static void main(String[] args) throws IOException {

   FileInputStream fis=new FileInputStream("C:\\Users\\GOPALAKRISHNA\\Desktop\\login.xlsx");
   
   XSSFWorkbook wb= new XSSFWorkbook(fis);
   XSSFSheet sh= wb.getSheet("Sheet1");
   XSSFRow row=sh.getRow(0);
  
   XSSFCell cell=null;
  int colnumber = 0;
  for(int i=0; i<row.getLastCellNum(); i++) {
	  if(row.getCell(i).getStringCellValue().trim().equals("city")) {
		  colnumber=i;
	  }
	  row=sh.getRow(5);
	  cell=row.getCell(colnumber);
	  String city = String.valueOf(cell.getStringCellValue());
	  
	  System.out.println("city name for perticular name::"+city);
	  wb.close();
	  fis.close();
  }
          
   
    

	}

}
