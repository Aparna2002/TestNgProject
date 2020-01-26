package TestngProject.com.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadingDataByColName 
{
 
  
  File file = new File("C:\\Users\\GOPALAKRISHNA\\Desktop\\SuiteB.xlsx");
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("beforemethod......");
  }
  @Test
  public String getCellData(String sheetName,String colName,int rowNum) throws IOException
  {
  FileInputStream fis = new FileInputStream(file);
  HSSFWorkbook workbook = new  HSSFWorkbook(fis);
  HSSFSheet sheet = workbook.getSheet("Keywords");
  
  
  
   {
	try
        {
          int colNum=-1;
         
          HSSFRow row = sheet.getRow(0);
          for(int i=0;i<row.getLastCellNum();i++)
           {
             if(row.getCell(i).getStringCellValue().trim().equals(colName))
             colNum=i;
           }
         row=sheet.getRow(rowNum);
         HSSFCell cell = row.getCell(colNum);
         if(cell.getCellTypeEnum()==CellType.STRING)
            return cell.getStringCellValue();
         else if(cell.getCellTypeEnum()==CellType.NUMERIC || cell.getCellTypeEnum()==CellType.FORMULA)
             {
               String cellValue = String.valueOf(cell.getNumericCellValue());
               if(HSSFDateUtil.isCellDateFormatted(cell))

				{

					DateFormat dt=new SimpleDateFormat("dd/mm/yyyy");

					Date date=cell.getDateCellValue();

					cellValue=dt.format(date);	

				}

				return cellValue;

			}

			else if(cell.getCellTypeEnum()==CellType.BLANK)

				return "";

			else

				return String.valueOf(cell.getBooleanCellValue());

		}
           catch(Exception e)
	{
           e.printStackTrace();
           return "No matching value";

		}

		

		

	}

  }	

}
