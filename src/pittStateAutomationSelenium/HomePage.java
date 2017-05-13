package pittStateAutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//this will store all the element locators and Methods of this page 

public class HomePage {
	
	//get the webdriver 
	WebDriver driver;
	
	//Objects
	By RightLink=By.id("right-panel-link");
	By gusClassic=By.xpath("//*[@id='right-panel']/ul[1]/li[8]/a");
	
	//creating constructor to intialize the webdriver 
	public HomePage (WebDriver driver) 
	{
		
		this.driver=driver;
		
	}


	

	//Creating Methods to perform by the automation testing
	public void clickonRightLink(){
		 
		driver.findElement(RightLink).click();
		
	}
	
	public void clickonGusClassic(){
		driver.findElement(gusClassic).click();
	}


	


	

}
