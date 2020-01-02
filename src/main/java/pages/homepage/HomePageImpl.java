package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.ActionBot;
import utilities.iConstants;

public class HomePageImpl implements IHomePage
{
	public static void clickFromField(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IHomePage.FROM);
		ActionBot.click(element);
	}
	
	public static void sendKeysFromField(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IHomePage.FROM);
		ActionBot.sendKeys(element, iConstants.FROM);
	}
	
	public static void selectOptionFromDropdown(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(By.xpath("//small[contains(text(),'"+iConstants.FROM_AIRPORT+"')]"));
		ActionBot.click(element);
	}
		
	public static void clickDestinationField(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IHomePage.DESTINATION);
		ActionBot.click(element);

	}
	
	public static void sendKeysDestinationField(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IHomePage.DESTINATION);
		ActionBot.sendKeys(element, iConstants.DESTINATION);
	}
		
	public static void selectOptionDestinationDropdown(WebDriver driver) throws Exception
	{
		WebElement element =driver.findElement(By.xpath("//small[contains(text(),'"+iConstants.DESTINATION_AIRPORT+"')]"));
		ActionBot.click(element);
	}
	
	public static void clickDepartureDate(WebDriver driver) throws Exception
	{
		WebElement element =driver.findElement(IHomePage.DEPARTURE_DATE);
		ActionBot.click(element);
	}
	
	public static void selectDepartureDate(WebDriver driver) throws Exception
	{
		WebElement element =driver.findElement(By.id("fare_"+iConstants.DATE));
		ActionBot.click(element);
	}
	
	
	public static void clickTravellerField(WebDriver driver) throws Exception
	{
		WebElement element =driver.findElement(IHomePage.TRAVELLER);
		ActionBot.click(element);
	} 
	
	public static void addAdult(WebDriver driver) throws Exception
	{
		WebElement element =driver.findElement(IHomePage.ADULT_ADD);
		ActionBot.click(element);
	} 
	
	public static void addChildren(WebDriver driver) throws Exception
	{
		WebElement element =driver.findElement(IHomePage.CHILDREN_ADD);
		ActionBot.click(element);
	} 
	public static void addInfant(WebDriver driver) throws Exception
	{
		WebElement element =driver.findElement(IHomePage.INFANT_ADD);
		ActionBot.click(element);
	} 
	
	public static void selectClass(WebDriver driver) throws Exception
	{
		Select dropdown = new Select(driver.findElement(IHomePage.TRAVEL_CLASS));
		dropdown.selectByVisibleText(iConstants.TRAVEL_CLASS);
	} 
	
	public static void clickSearch(WebDriver driver) throws Exception
	{
		WebElement element =driver.findElement(IHomePage.SEARCH);
		ActionBot.click(element);
	}
	

	
}
