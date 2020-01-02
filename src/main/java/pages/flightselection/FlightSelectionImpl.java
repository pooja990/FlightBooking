package pages.flightselection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.ActionBot;


public class FlightSelectionImpl implements IFlightSelection
{
	public static void clickDepartureFilter(WebDriver driver, String filter) throws Exception
	{
		WebElement element =driver.findElement(By.xpath("//span[contains(text(),'"+filter+"')]"));
		ActionBot.click(element);
	}
		
	public static void clickStop(WebDriver driver, String stop) throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//span[@class='ico16 fb'][contains(text(),'"+stop+"')]"));
		ActionBot.click(element);
	}
		
	public static void selectAirline(WebDriver driver, String airline) throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'"+airline+"')]"));
		ActionBot.click(element);
	}

	public static void clickSortDeparture(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IFlightSelection.DEPARTURE_SORT);
		ActionBot.click(element);
	}
	public static void clickSortDuration(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IFlightSelection.DURATION_SORT);
		ActionBot.click(element);
	}
	public static void clickSortArrival(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IFlightSelection.ARRIVAL_SORT);
		ActionBot.click(element);
	}
	public static void clickSortPrice(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IFlightSelection.PRICE_SORT);
		ActionBot.click(element);
	}
	public static void clickBookButton(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IFlightSelection.BOOK);
		ActionBot.click(element);
	}

	
}
