package Roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https:google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.name("q"));
		System.out.println("Value   :" + ele1.getAttribute("value"));
		System.out.println("Title   :" + ele1.getAttribute("title"));
		System.out.println("maxlength   :" + ele1.getAttribute("maxlength"));
		System.out.println("jsaction   :" + ele1.getAttribute("jsaction"));
		System.out.println("aria-autocomplete   :" + ele1.getAttribute("aria-autocomplete"));
		System.out.println("spellcheck   :" + ele1.getAttribute("spellcheck"));
		/*System.out.println(driver.getPageSource());*/
		
		driver.close();
	}

}
