package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void takeScreenCapture(WebDriver driver, String name) throws IOException {
		 
		String currentDateTime = ScreenShot.date();    
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\Int\\Elements\\src\\test\\Screenshot"+ name + "  " + currentDateTime +".jpg");
		
		FileHandler.copy(source, destination);
	}
	
	public static String date() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy-MMM-dd HH-mm-ss");
		LocalDateTime here = LocalDateTime.now();
		String d = dtf.format(here);
		return d;
	}

}
