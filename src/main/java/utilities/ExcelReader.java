package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	public static final String EXCELFILELOCATION ="./Data.xltm";
	private static FileInputStream fis;
	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	
	public static void loadExcel() throws Exception
	{
		System.out.println("Loading Excel data...");
		File file = new File(EXCELFILELOCATION);
		fis= new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("TestData");
		fis.close();
	}
	
	public static Map<String,String> dataMap = new HashMap<String, String>();
	
	public static Map<String,String> getDataMap() throws Exception
	{
		if(sheet==null)
		{
			loadExcel();
		}
		
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			row= sheet.getRow(i);
			String keyCell = row.getCell(0).getStringCellValue();
			int colNum = row.getLastCellNum();
			for(int j=1;j<colNum;j++)
			{			
				String value = row.getCell(j).getStringCellValue();
				dataMap.put(keyCell, value);		
			}
		}
		return dataMap;
	}
	
	public static String getData(String key)
	{
		String value = dataMap.get(key);
		return value;
	}

}
