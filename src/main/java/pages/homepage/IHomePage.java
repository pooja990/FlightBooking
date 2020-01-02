package pages.homepage;

import org.openqa.selenium.By;

import utilities.ElementReader;

public interface IHomePage 
{
	public static By FROM = ElementReader.getElement("from");
	public static By DESTINATION = ElementReader.getElement("destination");
	public static By FROM_DESTINATION_SELECTION = ElementReader.getElement("from_destination_selection");
	public static By DEPARTURE_DATE = ElementReader.getElement("departure_date");
	public static By RETURN_DATE = ElementReader.getElement("return_date");
	public static By DATE_SELECTOR = ElementReader.getElement("date_selector");
	public static By TRAVELLER = ElementReader.getElement("traveller");
	public static By ADULT_ADD = ElementReader.getElement("adult_add_option");
	public static By CHILDREN_ADD = ElementReader.getElement("children_add_option");
	public static By INFANT_ADD = ElementReader.getElement("infant_add_option");
	public static By TRAVEL_CLASS = ElementReader.getElement("travel_class");
	public static By SEARCH = ElementReader.getElement("travel_class");
	
}
