package pages.bookflight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.ActionBot;
import utilities.iConstants;


public class BookFlightImpl implements IBookFlight
{
	public static void clickRiskTypeRadio(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.RISK_RADIOBUTTON);
		ActionBot.click(element);
	}
	
	public static void clickTitleDropdown(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.TITLE);
		ActionBot.click(element);
	}
	
	public static void selectTitleOption(WebDriver driver) throws Exception
	{
		Select dropdown = new Select(driver.findElement(IBookFlight.TITLE));
		dropdown.selectByVisibleText(iConstants.TITLE);
	}
	
	public static void clickFirstName(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.RISK_RADIOBUTTON);
		ActionBot.click(element);
	}
	
	public static void sendKeysFirstName(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.FIRSTNAME);
		ActionBot.sendKeys(element, iConstants.FIRST_NAME);
	}
	
	public static void clickMiddleName(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.MIDDLENAME);
		ActionBot.click(element);
	}
	
	public static void sendKeysMiddleName(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.MIDDLENAME);
		ActionBot.sendKeys(element, iConstants.MIDDLE_NAME);
	}
	
	public static void clickLastName(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.LASTNAME);
		ActionBot.click(element);
	}
	
	public static void sendKeysLastName(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.LASTNAME);
		ActionBot.sendKeys(element, iConstants.LAST_NAME);
	}

	public static void clickEmail(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.EMAIL);
		ActionBot.click(element);
	}
	
	public static void sendKeysEmail(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.EMAIL);
		ActionBot.sendKeys(element, iConstants.EMAIL);
	}
	
	public static void clickMobile(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.CONTACT);
		ActionBot.click(element);
	}
	
	public static void sendKeysMobile(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.CONTACT);
		ActionBot.sendKeys(element, iConstants.CONTACT);
	}
	
	public static void clickProceedToPayment(WebDriver driver) throws Exception
	{
		WebElement element = driver.findElement(IBookFlight.PROCEED_TO_PAYMENT);
		ActionBot.click(element);
	}
	
	public static void clickDayDropdown(WebDriver driver) throws Exception
	{

		WebElement element = driver.findElement(IBookFlight.DAY_DOB);
		ActionBot.click(element);
	}
	
	public static void selectDayOption(WebDriver driver) throws Exception
	{
		Select dropdown = new Select(driver.findElement(IBookFlight.DAY_DOB));
		dropdown.selectByVisibleText(iConstants.DAY);
	}
	
	public static void clickMonthDropdown(WebDriver driver) throws Exception
	{

		WebElement element = driver.findElement(IBookFlight.MONTH_DOB);
		ActionBot.click(element);
	}
	
	public static void selectMonthOption(WebDriver driver) throws Exception
	{
		Select dropdown = new Select(driver.findElement(IBookFlight.MONTH_DOB));
		dropdown.selectByVisibleText(iConstants.MONTH);
	}
	
	public static void clickYearDropdown(WebDriver driver) throws Exception
	{

		WebElement element = driver.findElement(IBookFlight.YEAR_DOB);
		ActionBot.click(element);
	}
	
	public static void selectYearOption(WebDriver driver) throws Exception
	{
		Select dropdown = new Select(driver.findElement(IBookFlight.YEAR_DOB));
		dropdown.selectByVisibleText(iConstants.YEAR);
	}
	
	



	
}
