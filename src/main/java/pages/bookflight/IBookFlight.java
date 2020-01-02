package pages.bookflight;

import org.openqa.selenium.By;

import utilities.ElementReader;

public interface IBookFlight 
{
	public static By RISK_RADIOBUTTON = ElementReader.getElement("risk_trip_radio");
	public static By TITLE = ElementReader.getElement("title");
	public static By FIRSTNAME = ElementReader.getElement("firstName");
	public static By MIDDLENAME = ElementReader.getElement("middleName");
	public static By LASTNAME = ElementReader.getElement("lastName");
	public static By EMAIL = ElementReader.getElement("email");
	public static By CONTACT = ElementReader.getElement("contact");
	public static By PROCEED_TO_PAYMENT = ElementReader.getElement("proceed_To_Payment_Button");
	public static By DAY_DOB = ElementReader.getElement("day_DOB");
	public static By MONTH_DOB = ElementReader.getElement("month_DOB");
	public static By YEAR_DOB = ElementReader.getElement("year_DOB");

}
