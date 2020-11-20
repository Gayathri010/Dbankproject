package com.DBankCucumber.Helper;

import java.io.IOException;

public class FileReaderManager {

	
	private FileReaderManager() {
	}

	public static FileReaderManager getinstance() {

		FileReaderManager fr = new FileReaderManager();
		return fr;
	}
	
	public static ConfigurationReader getCRinstance() throws IOException {

		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
	
	
	
	
}
