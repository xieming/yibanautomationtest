package com.yiban.automation.pageobject;

import java.util.NoSuchElementException;

import junit.framework.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yiban.automation.utils.WebDriverWrapper;

public class LoginPage extends Page {

	@FindBy(how = How.NAME, using = "username")
	private WebElement userNameInput;

	@FindBy(how = How.NAME, using = "password")
	private WebElement passwordInput;

	@FindBy(how = How.CLASS_NAME, using = "login_go")
	private WebElement continueButton;

	@FindBy(how = How.XPATH, xpath = "//div/div[2]/ul[3]/li[1]/a[1]")
	private WebElement loginButton;

	@FindBy(how = How.XPATH, xpath = "//div[2]/ul[2]/li[4]/a/span")
	private WebElement logoutButton;

	// logoutButton = "//div[2]/ul[2]/li[4]/a/span";

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void enterUsername(String username) {
		userNameInput.clear();
		userNameInput.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordInput.clear();
		passwordInput.sendKeys(password);
	}

	public void clickContinueButton() {
		continueButton.click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		/*
		 * if(TestConfiguration.browser.name().equals("ie")) {
		 * WebDriverWrapper.executeJavaScript(driver,
		 * "scilearn.learnerLogin.checkIfLoginIsNeeded('022'); return false;; return false;"
		 * ); }
		 */

	}

	public void clickLoginButton() {
		loginButton.click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		// if(TestConfiguration.browser.name().equals("ie")) {
		// WebDriverWrapper.executeJavaScript(driver,"scilearn.learnerLogin.submitLoginForm();; return false;");
		// }

	}

	public void clickLogoutButton() {
		logoutButton.click();
		// if(TestConfiguration.browser.name().equals("ie")) {
		// WebDriverWrapper.executeJavaScript(driver,"scilearn.learnerLogin.submitLoginForm();; return false;");
		// }

	}

	public LoginPage login(String username, String password) {
		// driver.navigate().refresh();
		System.out.println("haha");
		// WebDriverWrapper.waitPageLoad(driver, 3);
		this.clickLoginButton();
		// WebDriverWrapper.waitPageLoad(driver, 3);
		this.enterUsername(username);
		this.enterPassword(password);
		System.out.println(continueButton.isEnabled());
		if (continueButton.isEnabled()) {
			this.clickContinueButton();
		} else {
			System.out.println("请输入用户名或密码");
		}
	/*	System.out.println("您输入的账号或密码不正确，请重新输入");
		if (driver.findElement(By.className("login_tips")) != null) {
			System.out.println("您输入的账号或密码不正确，请重新输入");
		}
*/
		return PageFactory.initElements(this.getDriver(), LoginPage.class);

	}

	public LoginPage logout() {
		System.out.println("hehe");
		WebDriverWrapper.waitPageLoad(driver, 8);
		// System.out.println(WebDriverWrapper.doesWebElementExist(driver,
		// logoutButton));

		// if (WebDriverWrapper.doesWebElementExist(driver, logoutButton))
		// {
		logoutButton.click();
		// driver.findElement(logoutButton).click();
		WebDriverWrapper.waitPageLoad(driver, 2);
		Alert alert = driver.switchTo().alert();
		String str = alert.getText();
		System.out.println(str);
		alert.accept();
		// }
		// else
		// {
		// System.out.println("用户没有登陆，请先登陆");
		// }
		System.out.println("hehe");
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(), LoginPage.class);
	}

}
