package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
	
	static Properties prop;
	
	public static String getProperty(String key){
		
		prop = new Properties();
		try {
			prop.load(new FileInputStream("E:\\Zaxxon\\ZaxxonMaven\\src\\test\\java\\com\\testBase\\GlobalProperties.properties"));
		} catch (IOException e) {
			
		}
		
		return prop.getProperty(key);		
		
	}

}
