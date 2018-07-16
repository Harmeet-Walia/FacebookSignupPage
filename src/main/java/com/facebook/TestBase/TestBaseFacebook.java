package com.facebook.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.signup.Facebook.pages.FacebookSignupPage;

public class TestBaseFacebook {
	
	public static WebDriver driver;
	public static Properties prop;

	public TestBaseFacebook() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/harmeetkaur/Eclipse-New/Facebook/src/main/java/com/"
					+ "config/properties/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
	



public static void initialisation() {

	String browsername = prop.getProperty("browser");

	if (browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/harmeetkaur/Downloads/chromedriver july 2018");
		driver = new ChromeDriver();

	} else if (browsername.equals("FF")) {
		System.setProperty("webdriver.gecko.driver", "/Users/harmeetkaur/Downloads/geckodriver");
		driver = new FirefoxDriver();
	}

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get(prop.getProperty("url"));
}
}
