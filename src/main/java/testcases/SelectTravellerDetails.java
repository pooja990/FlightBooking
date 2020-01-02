package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import businessflow.BookFlightPageFlow;
import utilities.DriverManager;

public class SelectTravellerDetails extends BookFlightPageFlow
{
	@Test
	public void selectTraveller()
	{
		WebDriver driver = DriverManager.getDriver();
		try {
			selectFlightAndBook(driver);
			switchWindow(driver);
			selectTravelProtection(driver);
			selectTravellerDetails(driver);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(driver!=null)
			{
				driver.close();
			}
		}
	}

}
