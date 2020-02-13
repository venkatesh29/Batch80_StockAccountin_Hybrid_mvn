package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
public static String getValueForKey(String Key) throws Exception{
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/PropertiesFile/Environment.properties");
		
		Properties configProperties=new Properties();
		
		configProperties.load(fis);
		
		return configProperties.getProperty(Key);	
	}

}
