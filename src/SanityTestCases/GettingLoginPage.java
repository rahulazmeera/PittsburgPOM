package SanityTestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


import pittStateAutomationSelenium.HomePage;
import pittStateAutomationSelenium.SignPage;




public class GettingLoginPage {

	
	//test cases to execute the tests

	@Test
	public void MovingTOGusClassic() throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\geckodriver.exe");
		// to connect to the firefox browser driver object
		WebDriver driver=new FirefoxDriver();
		//to maximize the window 
		driver.manage().window().maximize();
		//to get the Test URL needed
		driver.get("http://www.pittstate.edu");
		
		//create object of the page to perform test and parse the driver
		 HomePage homepage=new HomePage(driver);
		//now get the object to perform the steps 
		   homepage.clickonRightLink();
		   Thread.sleep(3000);
		   homepage.clickonGusClassic();   
		  
		  
	}
	
	
	@Test
	public void SignInPageValidation( ) throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver","E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\geckodriver.exe");
		// to connect to the firefox browser driver object
		WebDriver driver=new FirefoxDriver();
		//to maximize the window 
		driver.manage().window().maximize();
		//to get the Test URL needed
		driver.get("http://www.pittstate.edu");
		
		
		       HomePage homepage=new HomePage(driver);
			//now get the object to perform the steps 
		       homepage.clickonRightLink();
			   Thread.sleep(3000);
			   homepage.clickonGusClassic(); 
		
		     //creating object for the sign in page 
		     SignPage signValidation=new SignPage(driver);
		       Thread.sleep(3000);
		      //call the test methods from the previous class 
		     signValidation.TypeUserName("razmeera@gus.pittstate.edu");
		     signValidation.TypePassword("Deva@1993");
		     signValidation.clickCheckBox();
	         signValidation.ClickSignInPage();
	          
	         
	}
	
	
	@Test
	public void WorongUserNameGiven() throws InterruptedException{
		
		
		System.setProperty("webdriver.gecko.driver","E:\\transfered Drive F Study Volume\\selinium training and practice\\selinium by Udemi course\\geckodriver.exe");
		// to connect to the firefox browser driver object
		WebDriver driver=new FirefoxDriver();
		//to maximize the window 
		driver.manage().window().maximize();
		//to get the Test URL needed
		driver.get("http://www.pittstate.edu");
		
		
		       HomePage homepage=new HomePage(driver);
			//now get the object to perform the steps 
		       homepage.clickonRightLink();
			   Thread.sleep(3000);
			   homepage.clickonGusClassic(); 
		
		     //creating object for the sign in page 
		     SignPage signValidation=new SignPage(driver);
		       Thread.sleep(3000);
		      //call the test methods from the previous class 
		     signValidation.TypeUserName("razmeera@gus.pittstate.edu");
		     signValidation.TypePassword("Deva@1995");
		     signValidation.clickCheckBox();
	         signValidation.ClickSignInPage();
	         
		
		
	}
	
	

}
