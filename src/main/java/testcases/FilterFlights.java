package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import businessflow.FlightSelectionPageFlow;
import businessflow.HomePageFlow;
import utilities.DriverManager;

public class FilterFlights extends FlightSelectionPageFlow
{
	@Test
	public void filterFlights()
	{
		WebDriver driver = DriverManager.getDriver();
		try {
			selectFlight(driver);
			selectFilter(driver);
			
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
