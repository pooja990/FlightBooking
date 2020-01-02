package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import businessflow.FlightSelectionPageFlow;
import utilities.DriverManager;

public class BookFlight extends FlightSelectionPageFlow
{
	@Test
	public void bookFlight()
	{
		WebDriver driver = DriverManager.getDriver();
		try {
			selectFlight(driver);
			bookFlight(driver);
			
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

