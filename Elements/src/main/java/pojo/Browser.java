package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
    public static WebDriver chromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Int\\chromedriver.exe");     
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
	    return driver;
		
	} 

}
