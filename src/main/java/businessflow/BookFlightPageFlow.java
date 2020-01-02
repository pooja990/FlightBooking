package businessflow;

import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import pages.bookflight.BookFlightImpl;
import pages.bookflight.IBookFlight;
import utilities.ActionBot;

public class BookFlightPageFlow extends BookFlightImpl
{
	public static void selectFlightAndBook(WebDriver driver) throws Exception
	{
		FlightSelectionPageFlow.selectFlight(driver);
		FlightSelectionPageFlow.bookFlight(driver);
	}
	
	public static void switchWindow(WebDriver driver)
	{
		Set<String> allWindowHandles = driver.getWindowHandles();
		 
		 for(String handle : allWindowHandles)
		 {
			 driver.switchTo().window(handle);
		 }
	}
	
	public static void selectTravelProtection(WebDriver driver) throws Exception
	{
		ActionBot.waitForElementVisible(driver, IBookFlight.RISK_RADIOBUTTON);
		ActionBot.waitForElementClickable(driver, IBookFlight.RISK_RADIOBUTTON);
		clickRiskTypeRadio(driver);
	}
	
	
	public static void selectTravellerDetails(WebDriver driver) throws Exception
	{
		clickTitleDropdown(driver);
		selectTitleOption(driver);
		clickFirstName(driver);
		sendKeysFirstName(driver);
		clickMiddleName(driver);
		sendKeysMiddleName(driver);
		clickLastName(driver);
		sendKeysLastName(driver);
		clickEmail(driver);
		sendKeysEmail(driver);
		clickMobile(driver);
		sendKeysMobile(driver);
	}
	
	public static void proceedToPayment(WebDriver driver)
	{
		ActionBot.waitForElementVisible(driver, IBookFlight.PROCEED_TO_PAYMENT);
		ActionBot.waitForElementClickable(driver, IBookFlight.PROCEED_TO_PAYMENT);
		proceedToPayment(driver);
	}
	
	
}
