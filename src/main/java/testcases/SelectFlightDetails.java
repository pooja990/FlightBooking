package testcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import businessflow.HomePageFlow;

import utilities.DriverManager;
import utilities.ElementReader;


public class SelectFlightDetails extends HomePageFlow {

	@Test
	public void selectFlight() 
	{
		
		WebDriver driver = DriverManager.getDriver();
		try {
		
			HomePageFlow.addFromToDetails(driver);
			HomePageFlow.selectTravellerDetails(driver);
			HomePageFlow.searchFlights(driver);
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

	@BeforeSuite
	public void setEnv() 
	{
		try {
			ElementReader.getUIElements();

//			ExcelReader.getDataMap();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
