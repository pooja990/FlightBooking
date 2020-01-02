package utilities;

import config.PropertiesConfigurator;

public interface ConfigImpl 
{
	public static String BASE_URL = PropertiesConfigurator.getProperty("BASE_URL");
	public static int DEFAULT_WAIT = Integer.parseInt(PropertiesConfigurator.getProperty("DEFAULT_WAIT"));
	public static int DEFAULT_LOW_WAIT = Integer.parseInt(PropertiesConfigurator.getProperty("DEFAULT_LOW_WAIT"));
	public static int DEFAULT_MEDIUM_WAIT = Integer.parseInt(PropertiesConfigurator.getProperty("DEFAULT_MEDIUM_WAIT"));
	public static int DEFAULT_HIGH_WAIT = Integer.parseInt(PropertiesConfigurator.getProperty("DEFAULT_HIGH_WAIT"));
	public static int CONDITIONAL_WAIT = Integer.parseInt(PropertiesConfigurator.getProperty("CONDITIONAL_WAIT"));
	public static String BROWSER = PropertiesConfigurator.getProperty("BROWSER");
}
