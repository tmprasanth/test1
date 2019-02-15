package dayseven;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		File obj = ((TakesScreenshot) driver)
				      .getScreenshotAs(OutputType.FILE);
	    //copy the contents of the obj into a file
		FileUtils.copyFile(obj,new File( "E:\\screenshot.png"));
		driver.close();
	}

}
