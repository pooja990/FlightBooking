package businessflow;

import org.openqa.selenium.WebDriver;

import pages.homepage.HomePageImpl;
import pages.homepage.IHomePage;
import utilities.ActionBot;
import utilities.iConstants;

public class HomePageFlow extends HomePageImpl
{
	
	public  static void addFromToDetails(WebDriver driver) throws Exception
	{		
		clickFromField(driver);
		sendKeysFromField(driver);
		
		ActionBot.waitForElementVisible(driver, IHomePage.FROM);

		selectOptionFromDropdown(driver);
	
		clickDestinationField(driver);
		sendKeysDestinationField(driver);

		ActionBot.waitForElementVisible(driver, IHomePage.FROM);

		selectOptionFromDropdown(driver);
		
		clickDepartureDate(driver);
		selectDepartureDate(driver);
		
	}
	
	public static void selectTravellerDetails(WebDriver driver) throws Exception
	{
		clickTravellerField(driver);
		if(Integer.parseInt(iConstants.ADULTS)>0)
		{
			for(int i=1;i<Integer.parseInt(iConstants.ADULTS);i++)
			{
				addAdult(driver);
			}
		}
		
		if(Integer.parseInt(iConstants.CHILDREN)>0)
		{
			for(int i=1;i<=Integer.parseInt(iConstants.CHILDREN);i++)
			{
				addChildren(driver);
			}
		}
		
		if(Integer.parseInt(iConstants.INFANT)>0)
		{
			for(int i=1;i<=Integer.parseInt(iConstants.INFANT);i++)
			{
				addInfant(driver);
			}
		}
		
		selectClass(driver);
		
	}
	
	public static void searchFlights(WebDriver driver) throws Exception
	{
		ActionBot.waitForElementVisible(driver, IHomePage.SEARCH);
		clickSearch(driver);
	}
	

}
