package Testng.co;

import org.testng.annotations.Test;

import TestngProject.com.scripts.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class WebTableRowsAndColums extends BaseTest {
	
  @Test
  public void rowsAndColums() {
		
		  WebElement myTable = driver.findElement(By.xpath("/html/body/table/tbody"));
		  List<WebElement> tableRow = myTable.findElements(By.tagName("tr"));
		  int row_count= tableRow.size();
		  System.out.println("row count:: "+row_count);
		  
	        for(int row=0;row<row_count;row++) {
		  
		  List<WebElement> col_table = tableRow.get(row).findElements(By.tagName("td")); 
		  int col_count = col_table.size(); 
		  System.out.println("coulum count::"+col_count);
		  System.out.println("no of rows ");
		  for(int colum=0; colum<col_count;colum++) {
			  System.out.println("row count " +row+  "colum count"  +colum);
			  //to retrieve the text from the specific cell
			  
			  String celtext = col_table.get(colum).getText();
			  System.out.println("row count " +row+  "colum count"  +colum+  celtext);
			  
		  }
		  
		  
		 
	  
		//To locate table.
		/*
		 * WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
		 * //To locate rows of table. List < WebElement > rows_table =
		 * mytable.findElements(By.tagName("tr")); //To calculate no of rows In table.
		 * int rows_count = rows_table.size(); //Loop will execute till the last row of
		 * table. for (int row = 0; row < rows_count; row++) { //To locate
		 * columns(cells) of that specific row. List < WebElement > Columns_row =
		 * rows_table.get(row).findElements(By.tagName("td")); //To calculate no of
		 * columns (cells). In that specific row. int columns_count =
		 * Columns_row.size(); System.out.println("Number of cells In Row " + row +
		 * " are " + columns_count); //Loop will execute till the last cell of that
		 * specific row. for (int column = 0; column < columns_count; column++) { // To
		 * retrieve text from that specific cell. String celtext =
		 * Columns_row.get(column).getText();
		 * System.out.println("Cell Value of row number " + row + " and column number "
		 * + column + " Is " + celtext); } }
		 */
	        }           
		 
	 }
	 
	  
  
  
  @BeforeMethod
  public void startUp() throws IOException {
	  init();
	  launch("chromebrowser");
	  navigateurl("guruurl2");
	  
  }

  @AfterMethod
  public void endProcess() {
  }

}
