package com.yiban.automation.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yiban.automation.utils.WebDriverWrapper;

public class LuntanyePage extends FrontPage {

	@FindBy(how = How.XPATH, using = "//div[2]/ul[1]/li[2]/a[1]/u")
	private WebElement luntan;

	public LuntanyePage(WebDriver driver) {
		super(driver);
	}

	public void checkeachactivity() {
		WebDriverWrapper.hoverandclick(luntan, driver);
		List<WebElement> rows = driver.findElements(By.cssSelector("li.s_li a"));
	//	for (WebElement row : rows) {
		 for(int i = 0;i<rows.size();i++){
			
		
			clickluntan();
//		    System.out.println(rows.get(i).getText());
//			System.out.println(rows.get(i));
	//		WebDriverWrapper.waitPageLoad(driver, 3);
		//    ((JavascriptExecutor)driver).executeScript("document.getElementsBycssSelector('rows.get(i)').click();");
	//		WebDriverWrapper.hoverandclick(luntan, driver);
//			((JavascriptExecutor)driver).executeScript("document.getElementsByXpath('//div[2]/ul[1]/li[2]/a[1]/u').click();");
			WebDriverWrapper.waitPageLoad(driver, 5);
			 rows.get(i).click();
			 WebDriverWrapper.waitPageLoad(driver, 5);
			 driver.navigate().back();

			
		}
	}

	public void clickluntan() {
		luntan.click();
		WebDriverWrapper.hoverandclick(luntan, driver);
		System.out.println("点中了");
		WebDriverWrapper.waitPageLoad(driver, 2);

	}

	public LuntanyePage luntanurl() {
		driver.navigate().refresh();
		
		checkeachactivity();
		return PageFactory.initElements(this.getDriver(), LuntanyePage.class);
	}

}
