package utilities;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.codeborne.selenide.WebDriverRunner;

import pages.flightselection.FlightSelectionImpl;

public class ActionBot 
{
	public static Logger logger = Logger.getLogger("logging");
	
	
	public static boolean waitForElementVisible(WebDriver driver, By elementBy)
	{

		boolean isVisible = false;
		WebElement element=driver.findElement(elementBy);
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, ConfigImpl.DEFAULT_MEDIUM_WAIT);
			if(wait.until(ExpectedConditions.visibilityOf(element)) != null)
			{
				isVisible = true;
				logger.info("Element is visible");
			}
		}
		catch (Exception e) 
		{
			logger.info("Element is not visible");
			isVisible = false;
		}
		
		return isVisible;
	}
	
	public static boolean waitForElementClickable(WebDriver driver, By elementBy)
	{
		boolean isClickable = false;
		WebElement element = driver.findElement(elementBy);
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, ConfigImpl.DEFAULT_MEDIUM_WAIT);
			 if(wait.until(ExpectedConditions.elementToBeClickable(element)) !=null)
			 {
				 isClickable = true;
				 logger.info("Element is clickable");
			 }
		}
		catch(Exception e)
		{
			logger.info("Element is not clickable");
			isClickable = false;
		}	
		
		return isClickable;
	}
	
	public static boolean verifyElementVisible(WebElement element)
	{
		boolean isVisible = false;
		try
		{
			if(element.isDisplayed())
			{
				isVisible = true;
				logger.info("Element is visible");
			}
		}
		catch(Exception e)
		{
			logger.info("Element is not visible");
			isVisible = false;
		}			
		return isVisible;
	}
	
	public static boolean verifyElementClickable(WebElement element)
	{
		boolean isClickable = false;
		try
		{
			if(element.isEnabled())
			{
				isClickable = true;
				logger.info("Element is Clickable");
			}
		}
		catch (Exception e) 
		{
			isClickable = false;
			logger.info("Element is not Clickable");
		}
		
		return isClickable;
	}
	
	
	public static void click(WebElement element) throws Exception
	{
		try
		{	
			if(element != null)
			{
				if(verifyElementVisible(element))
				{
					if((verifyElementClickable(element)))
					{
						element.click();
						logger.info("Clicked an element");
					}
				}		
			}
		}
		catch(Exception e)
		{
			logger.info("Exception occurred while clicking on element.");
			throw e;
		}
	}
	
	public static void sendKeys(WebElement element, String text) throws Exception
	{
		try
		{
			if(element != null)
			{
				if(verifyElementVisible(element))
				{
					if((verifyElementClickable(element)))
					{
						element.sendKeys(text);
						logger.info("Entered value is:"+text);
					}
				}
			}

		}
		catch(Exception e)
		{
			logger.info("Exception occurred on sendkeys");
			throw e;
		}
	}
	
	public static void clearText(WebElement element) throws Exception
	{
		try
		{
			if(element != null)
			{
				if(verifyElementVisible(element))
				{
					if((verifyElementClickable(element)))
					{
						element.clear();
						logger.info("Cleared text");
					}
				}
			}

		}
		catch(Exception e)
		{
			logger.info("Exception occurred while clicking on element.");
			throw e;
		}
	}
	
	public static void multiSelect(WebDriver driver) throws Exception
	{
		try
		{
			if(iConstants.AIRLINE.contains("\\s*[|]\\s*"))
			{				
				List<String> airline = Arrays.asList(iConstants.AIRLINE.split("\\s*[|]\\s*"));
				for(int i=0;i<airline.size();i++)
				{
//					String item = airline.get(i);
					FlightSelectionImpl.selectAirline(driver, airline.get(i));
				}
			}
			else
			{
				FlightSelectionImpl.selectAirline(driver, iConstants.AIRLINE);
			}
			
			if(iConstants.DEPARTURE_TIME.contains("\\s*[|]\\s*"))
			{				
				List<String> departure_time = Arrays.asList(iConstants.DEPARTURE_TIME.split("\\s*[|]\\s*"));
				for(int i=0;i<departure_time.size();i++)
				{
					FlightSelectionImpl.selectAirline(driver, departure_time.get(i));
				}
			}
			else
			{
				FlightSelectionImpl.selectAirline(driver, iConstants.DEPARTURE_TIME);
			}
			
			if(iConstants.STOPS.contains("\\s*[|]\\s*"))
			{				
				List<String> stops = Arrays.asList(iConstants.STOPS.split("\\s*[|]\\s*"));
				for(int i=0;i<stops.size();i++)
				{
					FlightSelectionImpl.selectAirline(driver, stops.get(i));
				}
			}
			else
			{
				FlightSelectionImpl.selectAirline(driver, iConstants.STOPS);
			}


		}
		catch(Exception e)
		{
			logger.info("Exception occured while selecting airline/departure_time/stops.");
			throw e;
		}
	}
	
	
	
	
}
