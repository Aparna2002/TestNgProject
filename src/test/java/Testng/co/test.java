package Testng.co;

import java.io.IOException;

import TestngProject.com.scripts.BaseTest2;

public class test extends BaseTest2 {

	public static void main(String[] args) throws IOException {
      
		init();
		launch("chromebrowser");
		navigateurl("toursurl");

	}

}
