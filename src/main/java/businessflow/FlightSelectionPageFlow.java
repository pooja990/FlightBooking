package businessflow;

import org.openqa.selenium.WebDriver;

import pages.flightselection.FlightSelectionImpl;
import pages.flightselection.IFlightSelection;
import utilities.ActionBot;
import utilities.iConstants;

public class FlightSelectionPageFlow extends FlightSelectionImpl
{
	public static void selectFlight(WebDriver driver) throws Exception
	{
		HomePageFlow.addFromToDetails(driver);
		HomePageFlow.selectTravellerDetails(driver);
		HomePageFlow.searchFlights(driver);
	}
	
	public static void selectFilter(WebDriver driver) throws Exception
	{
		ActionBot.multiSelect(driver);
	}
	
	public static void sortBy(WebDriver driver) throws Exception
	{
		if(iConstants.SORT_BY.equals("Price"))
		{
			ActionBot.waitForElementClickable(driver, IFlightSelection.PRICE_SORT);
			clickSortPrice(driver);
		}
		else if(iConstants.SORT_BY.equals("Arrival"))
		{
			ActionBot.waitForElementClickable(driver, IFlightSelection.ARRIVAL_SORT);
			clickSortArrival(driver);
		}
		else if(iConstants.SORT_BY.equals("Duration"))
		{
			ActionBot.waitForElementClickable(driver, IFlightSelection.DURATION_SORT);
			clickSortDuration(driver);
		}
		else if(iConstants.SORT_BY.equals("Departure"))
		{
			ActionBot.waitForElementClickable(driver, IFlightSelection.DEPARTURE_SORT);
			clickSortDeparture(driver);
		}			
	}
	
	public static void bookFlight(WebDriver driver) throws Exception
	{
		ActionBot.waitForElementVisible(driver, IFlightSelection.BOOK);
		ActionBot.waitForElementClickable(driver, IFlightSelection.BOOK);
		clickBookButton(driver);
	}
	
}
