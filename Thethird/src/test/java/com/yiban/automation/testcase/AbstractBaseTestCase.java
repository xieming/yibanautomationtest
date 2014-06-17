package com.yiban.automation.testcase;

import static org.junit.Assert.fail;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.yiban.automation.utils.TestConfiguration;

public class AbstractBaseTestCase {

	protected static WebDriver driver;

	protected static String baseUrl;

	@Rule
	public TestRule myScreenshot = new com.yiban.automation.utils.TakeScreenshotOnFailureRule(
			driver);

	@BeforeClass
	public static void beforeClass() throws Exception {
		// System.setProperty("webdriver.firefox.bin",
		// "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		// WebDriver driver = new FirefoxDriver();
	//	FirefoxProfile f = new FirefoxProfile();
	//	driver = new FirefoxDriver(f);
		driver = new ChromeDriver();
	//	driver = new InternetExplorerDriver();
		baseUrl = "http://www.yiban.cn/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void afterClass() throws Exception {
		driver.quit();
	}

	@Before
	public void setUp() throws Exception {

		driver.get(baseUrl);
	}

	@After
	public void tearDown() throws Exception {
		/*
		 * Before quit the browser, close training session.
		 */
		// WebDriverWrapper.executeJavaScript(driver,
		// "SESSION_UPLOAD.closeTrainingSession();");
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

}
