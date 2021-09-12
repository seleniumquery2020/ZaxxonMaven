package com.Utilities;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class WebInteracableUtils {

	public static void setUp() {
		String browserName = PropertiesUtils.getProperty("driverName");
		switch (browserName.trim().toUpperCase()) {
		case "CHROME": {
			System.setProperty("webdriver.chrome.driver", PropertiesUtils.getProperty("chromePath"));
			DriverUtils.setDriver(new ChromeDriver());
			
			break;
		}
		case "FIREFOX": {
			System.setProperty("webdriver.gecko.driver", "D:\\FrameWork\\Driver\\geckodriver.exe");
			DriverUtils.setDriver(new FirefoxDriver());
			break;
		}
		case "EDGE": {
			System.setProperty("webdriver.edge.driver", "D:\\FrameWork\\Driver\\msedgedriver.exe");
			DriverUtils.setDriver(new EdgeDriver());
			break;
		}
		default: {
			System.out.println("No matching case found");
			Assert.fail();
		}

		}
		LoggerUtils.logMessage(browserName+" Browser is open Successfully");
		DriverUtils.getDriver().manage().window().maximize();
		DriverUtils.getDriver().get(PropertiesUtils.getProperty("url"));
		LoggerUtils.logMessage(PropertiesUtils.getProperty("url")+" is loaded");

	}

	public static void tearDown() {
		DriverUtils.getDriver().close();
		LoggerUtils.logMessage("Browser closed");
	}

	
	public static String getTitle() {

		
		return DriverUtils.getDriver().getTitle();
		
	}

	public static void clear(WebElement element) {

		element.clear();

	}

	public static String getCurrentUrl() {
		return DriverUtils.getDriver().getCurrentUrl();
	}

	public static String getPgeResourse() {
		return DriverUtils.getDriver().getPageSource();
	}

	public static String getWindowHandle() {
		return DriverUtils.getDriver().getWindowHandle();
	}

	public static Set<String> WindowHandles() {
		return DriverUtils.getDriver().getWindowHandles();
	}

	public static void navigateBack() {
		DriverUtils.getDriver().navigate().back();
	}

	public static void refresh() {
		DriverUtils.getDriver().navigate().refresh();
	}

	public static void navigateForward() {
		DriverUtils.getDriver().navigate().forward();

	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static String getAttribute(WebElement element, String attributeName) {
		
		String value = element.getAttribute(attributeName);
		
		return value;

		/*WebElement v = DriverUtils.getDriver().findElement(By.name("email"));
		String value = v.getAttribute(attributename);
		System.out.println(value);
		return value;*/
	
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void getCssValue(WebElement element, String attributeName) {
		element.getCssValue(attributeName);
	}

	public static String getText(WebElement element) {
		return element.getText();
	}

	public static boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public static boolean  isEnabled(WebElement element) {
		
		 return element.isEnabled();
		
	}

	public static boolean isSelected(WebElement element) {
		return element.isSelected();
	}
	
	public static void main(String[] args) {

			String path = System.getProperty("user.dir");
			System.out.println(path);
			
			System.out.println(PropertiesUtils.getProperty("chromePath"));
			
			setUp();
	}
}
