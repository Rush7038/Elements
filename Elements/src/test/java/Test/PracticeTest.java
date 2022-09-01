package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.Practice;
import utility.Excel;
import utility.ScreenShot;


public class PracticeTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() 
	{ 
		  driver = Browser.chromeBrowser();
	}
	
	@Test
	public void textBoxTest() throws EncryptedDocumentException, IOException, InterruptedException {
		Practice practice = new Practice(driver);
		practice.clickOnTextBox();
		String valueFullName = Excel.getData("PracticeData", 0, 0);
		String valueEmail = Excel.getData("PracticeData", 1, 0);
		String valueCaddress = Excel.getData("PracticeData", 2, 0);
		String valuePaddress = Excel.getData("PracticeData", 3, 0);
		
		practice.enterFullName(valueFullName);
		practice.enterEmail(valueEmail);
		practice.enterCurrentAddress(valueCaddress);
		practice.enterPermenantAddress(valuePaddress);
		practice.clickOnSubmit(driver);
	}
	
	@Test
	public void checkBoxTest() {
		Practice practice = new Practice(driver);
		practice.clickOnCheckBox();
		practice.clickOnExpandAll();
		practice.clickOnHome();
		practice.clickOnCollapseAll();
	
	}
	
	@Test
	public void radioButtonTest() {
		Practice practice = new Practice(driver);
		practice.clickOnRadioButton();
		practice.clickOnYesRadio();
		practice.clickOnImpressiveRadioButton();
	}
	
	@Test
	public void webTableTest() throws InterruptedException, EncryptedDocumentException, IOException  {
		Practice practice = new Practice(driver);
		practice.clickOnWebTable();
		practice.clickOnAdd();
		String valueFirstName = Excel.getData("PracticeData", 5, 0);
		String valueLastName = Excel.getData("PracticeData", 6, 0);
		String valueMailId = Excel.getData("PracticeData", 7, 0);
		String valueAge = Excel.getData("PracticeData", 8, 0);
		String valueSalary = Excel.getData("PracticeData", 9, 0);
		String valueDepartment = Excel.getData("PracticeData", 10, 0);
		
		practice.enterFirstName(valueFirstName); 
		practice.enterLastName(valueLastName);
		practice.enterMailId(valueMailId);
		practice.enterAge(valueAge);
		practice.enterSalary(valueSalary);
		practice.enterDepartment(valueDepartment);
		practice.clickONSubmitButton();
		practice.enterSearchBox("Rahul", driver);
	}
	
	@Test
	public void buttonsTest() { 
		Practice practice = new Practice(driver);
		practice.clickOnButtons(driver);
    	practice.clickOnDoubleClick(driver);
		practice.clickOnRightClick(driver);
		practice.clickOnDynamicClick(driver);
		
	}
	
	@Test 
	public void linksTest() {
		Practice practice = new Practice(driver);
		practice.clickOnLinks(driver);
		practice.clickOnForbidden(driver);
		practice.clickOnSimpleLink(driver);
			
	}
	
	@Test
	public void brokenLinkTest() throws InterruptedException {
		Practice practice = new Practice(driver);
		practice.clickOnBrokenLink(driver);
		practice.clickOnValidLink(driver);
		practice.clickOnInvalidLink(driver);
		
	}
	
	@Test
	public void uploadTest() {
		Practice practice = new Practice(driver);
		practice.clickOnUpload(driver);
		practice.clickOnDownloadButton();
		
	} 
	
	@Test
	public void dynamicPropertiesTest() {
		Practice practice = new Practice(driver);
		practice.clickOnDynamicProperties(driver);
		practice.checkColor(driver);
	}
		
	@AfterMethod
	public void takeScreenShot() throws IOException {
		ScreenShot.takeScreenCapture(driver, "Practice");
	}	
} 		

