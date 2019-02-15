package dayten;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLFirefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"E:\\tet\\geckodriver.exe");
		        
		FirefoxOptions FFO =new FirefoxOptions();
		FFO.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		WebDriver driver = new FirefoxDriver(FFO);
		driver.get("https://www.cacert.org");
		//driver.close();
			
	}

}
