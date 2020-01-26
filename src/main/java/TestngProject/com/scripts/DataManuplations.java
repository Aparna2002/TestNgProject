package TestngProject.com.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataManuplations {

	public static void main(String[] args) throws IOException {

       FileInputStream fis=new FileInputStream("C:\\Users\\GOPALAKRISHNA\\Desktop\\login.xlsx");
       XSSFWorkbook wb= new XSSFWorkbook(fis);
       XSSFSheet sh= wb.getSheet("Sheet1");
       XSSFRow row=sh.getRow(2);
       XSSFCell cell= row.getCell(3);
       String val = cell.getStringCellValue();
       System.out.println(val);
	}

}
