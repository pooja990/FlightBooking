
package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesConfigurator
{
	static Properties prop = new Properties();
	static 
	{
		try
		{
			InputStream input = new FileInputStream("./src/main/java/config/config.properties");
			prop.load(input);
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
	}
	
	public static String getProperty(String key)
	{
		String value="";
		value=prop.getProperty(key);
		return value;
	}
	
	/*public static Properties loadProperties()
	{
		try
		{
			InputStream input = new FileInputStream("config/config.properties");
			prop.load(input);
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
		return prop;
	}*/

}

