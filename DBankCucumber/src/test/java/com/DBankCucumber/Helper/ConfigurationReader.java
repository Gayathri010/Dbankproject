package com.DBankCucumber.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    static Properties p;
	public ConfigurationReader() throws IOException {
		
		
		File f = new File("C:\\Users\\gayathri\\eclipse-workspace\\DBankCucumber\\src\\test\\java\\com\\DBankCucumber\\Properties\\ConfigurationProperties");
		FileInputStream FIS = new FileInputStream(f);
		 p = new Properties();
		 p.load(FIS);
	}
	
	public static  String getbrowsename() {

		String browsername=p.getProperty("Browser");
	    return browsername;
	
	}
	public static String geturl() {

		String url = p.getProperty("url");
		return url;
	}
	
}
