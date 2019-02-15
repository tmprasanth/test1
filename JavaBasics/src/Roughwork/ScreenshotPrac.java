package Roughwork;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotPrac {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		TakesScreenshot screenshottingDriver = (TakesScreenshot)driver;
		File obj=screenshottingDriver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(obj, new File("D:\\Selenium\\Training\\Day7\\screenshot.png"));
	}

}
