package dayten;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLChrome {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver  driver = new ChromeDriver(opt);
		driver.get("https://www.cacert.org");
	}
}
