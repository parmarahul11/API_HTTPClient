package com.rest.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	public Properties prop;
	
	public final int RESPONSE_CODE_200 = 200;

	public TestBase() {
		prop = new Properties();
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\base\\config\\config.properties");
			prop.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
