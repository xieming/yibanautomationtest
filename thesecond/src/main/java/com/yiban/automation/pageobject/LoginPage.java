package com.yiban.automation.pageobject;

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

    public LoginPage login(String username, String password) {
    	driver.navigate().refresh();
    	System.out.println("haha");
        WebDriverWrapper.waitPageLoad(driver, 3);
        this.clickLoginButton();
        WebDriverWrapper.waitPageLoad(driver, 3);
        this.enterUsername(username);
        /*
         * if required to enter password which set by school manager on SLE
         */
        this.enterPassword(password);
        this.clickContinueButton();

        WebDriverWrapper.waitPageLoad(driver, 3);
        return PageFactory.initElements(this.getDriver(),
        		LoginPage.class);
    }

}
