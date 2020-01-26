package TestngProject.com.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {


	public static void main(String[] args) throws IOException {


		 FileInputStream fis = new FileInputStream("C:\\Users\\GOPALAKRISHNA\\Desktop\\Login.xlsx");
	     XSSFWorkbook workbook = new XSSFWorkbook(fis);


            FileOutputStream fos=null;

            XSSFSheet sheet = workbook.getSheet("Sheet1");

			XSSFRow row=null;

			XSSFCell cell=null;

			XSSFFont font=workbook.createFont();

			XSSFCellStyle style=workbook.createCellStyle();

			

			row=sheet.getRow(4);

			cell=row.getCell(4);

			

			font.setFontName("Algerian");

			font.setFontHeight(14.0);

			font.setBold(true);

			

			style.setFont(font);

			

			cell.setCellStyle(style);

			cell.setCellValue("Stop");

			

			

			fos=new FileOutputStream("C:\\Users\\GOPALAKRISHNA\\Desktop\\Login.xlsx");

			workbook.write(fos);

			fos.close();

		}



}
