package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import businessflow.FlightSelectionPageFlow;
import utilities.DriverManager;

public class SortFlights extends FlightSelectionPageFlow
{
	@Test
	public void filterFlights()
	{
		WebDriver driver = DriverManager.getDriver();
		try {
			selectFlight(driver);
			sortBy(driver);
			
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
