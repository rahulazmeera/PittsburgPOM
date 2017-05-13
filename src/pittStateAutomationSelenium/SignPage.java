package pittStateAutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignPage {
	
	WebDriver driver;
	
	//Objects in This LoginPage 
	By username=By.id("userNameInput");
	By password=By.id("passwordInput");
    By CheckBox=By.id("kmsiInput");
    By SignButton=By.id("submitButton");
	
	
	
	//create constructor for this page 
	
	public SignPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	//create methods to be executed when called in test cases
	
	//to send username details
	public void TypeUserName(String UID){
		driver.findElement(username).sendKeys(UID);
	}
	
	//to send the password details
	public void TypePassword(String Pas){
         driver.findElement(password).sendKeys(Pas);
	}
	
	//Mark The Check box
	public void clickCheckBox(){
		driver.findElement(CheckBox).click();
	}
	
	//to click the sign in button 
	public void ClickSignInPage(){
		driver.findElement(SignButton).click();
	}
	
	

}
