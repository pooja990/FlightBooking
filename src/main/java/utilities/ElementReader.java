package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;

public class ElementReader 
{
	public static final String EXCELFILELOCATION ="./Elements.xlsx";
	private static FileInputStream fis;
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	
	public static Map<String, By> UIElements		= new HashMap<String, By>();
	
	public static void loadExcel() throws Exception
	{
		System.out.println("Loading Excel data...");
		File file = new File(EXCELFILELOCATION);
		fis= new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		fis.close();
	}
	
	
	public static Map<String, By> getUIElements() throws Exception
	{
		Map<String, By> UIElementmap = new LinkedHashMap<String, By>();
		try
		{

			By findBy = null;

			if(sheet==null)
			{
				loadExcel();
			}
			
			for(int i=1;i<=sheet.getLastRowNum();i++)
			{
				row= sheet.getRow(i);
				String elementKey = row.getCell(0).getStringCellValue();
				int colNum = row.getLastCellNum()-1;
				for(int j=1;j<colNum;j++)
				{			
					String elementType = row.getCell(j).getStringCellValue();
					String elementValue = row.getCell(j+1).getStringCellValue();
					findBy = elementValue(elementType, elementValue);	
					UIElementmap.put(elementKey, findBy);

				}
			}
	
	
		}
		catch (Exception e)
		{
			throw e;
		}
		return UIElementmap;

	}
	
	public static By elementValue(String locatorType, String locatorValue) throws Exception
	{
		By findBy = null;

		try
		{
			if (locatorType.equalsIgnoreCase("XPATH"))
			{
				findBy = By.xpath(locatorValue);
			}

			else if (locatorType.equalsIgnoreCase("ID"))
			{
				findBy = By.id(locatorValue);
			}

			else if (locatorType.equalsIgnoreCase("NAME"))
			{
				findBy = By.name(locatorValue);
			}

			else if (locatorType.equalsIgnoreCase("CLASS"))
			{
				findBy = By.className(locatorValue);
			}

			else if (locatorType.equalsIgnoreCase("TAGNAME"))
			{
				findBy = By.tagName(locatorValue);
			}

			else if (locatorType.equalsIgnoreCase("CSSSeclector"))
			{
				findBy = By.cssSelector(locatorValue);
			}

		}

		catch (Exception e)
		{
			throw e;
		}

		return findBy;

	}



	public static By getElement(String elementName)
	{

		return UIElements.get(elementName);

	}
	

}
