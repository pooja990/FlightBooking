package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class DriverManager 
{
	public static WebDriver getDriver()
	{
		WebDriver driver = null;
		
		if("Chrome".equalsIgnoreCase(ConfigImpl.BROWSER))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja.singh\\workspace\\flightsBooking\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(ConfigImpl.BASE_URL);
			//Use remotWebDriver
			
//			System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//			DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
//			WebDriver driver = new RemoteWebDriver(new URL(url), desiredCapabilities);
//			driver.get("http://www.google.com");
			
//			DesiredCapabilities capability = new DesiredCapabilities.firefox();
//
//			capability.setVersion(“32.0”);
//
//			capability.setPlatform(Platform.WIN8);
//
//			URL RegisteredUrl = new URL(“http://10.10.10.10:4444/wd/hub”);
//
//			WebDriver driver = new WebDriver(RegisteredUrl, capability);
//
//			driver.get(“http://www.edureka.co”);
		}
		else if("Firefox".equalsIgnoreCase(ConfigImpl.BROWSER))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\pooja.singh\\workspace\\flightsBooking\\geckodriver-v0.26.0-win64\\geckodriver.exe");	
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(ConfigImpl.BASE_URL);
		}
		else if("IE".equalsIgnoreCase(ConfigImpl.BROWSER))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");	
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(ConfigImpl.BASE_URL);
		}
		
		return driver;
		
	}

}
