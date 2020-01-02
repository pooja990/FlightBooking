package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import businessflow.HomePageFlow;
import utilities.DriverManager;

public class AddMutipleTravellers extends HomePageFlow
{
	@Test
	public void addMutipleTravellers()
	{
		WebDriver driver = DriverManager.getDriver();
		try {
		
			HomePageFlow.addFromToDetails(driver);
			HomePageFlow.selectTravellerDetails(driver);
//			HomePageFlow.searchFlights(driver);
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
