package pages.flightselection;

import org.openqa.selenium.By;

import utilities.ElementReader;

public interface IFlightSelection 
{
	public static By DEPARTURE_SORT = ElementReader.getElement("departure_Sort");
	public static By DURATION_SORT = ElementReader.getElement("duration_Sort");
	public static By ARRIVAL_SORT = ElementReader.getElement("arrival_Sort");
	public static By PRICE_SORT = ElementReader.getElement("price_Sort");
//	public static By DEPARTURE_TIME_FILTER_1 = ElementReader.getElement("departure_Time_Filter1");
//	public static By DEPARTURE_TIME_FILTER_2 = ElementReader.getElement("departure_Time_Filter2");
//	public static By DEPARTURE_TIME_FILTER_3 = ElementReader.getElement("departure_Time_Filter3");
//	public static By DEPARTURE_TIME_FILTER_4 = ElementReader.getElement("departure_Time_Filter4");
//	public static By STOP_0 = ElementReader.getElement("stop0");
//	public static By STOP_1 = ElementReader.getElement("stop1");
//	public static By STOP_2 = ElementReader.getElement("stop2");
	public static By BOOK = ElementReader.getElement("book_Button");


	
}
