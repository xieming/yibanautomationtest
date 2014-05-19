package com.yiban.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yiban.automation.utils.WebDriverWrapper;

public class FrontPage extends Page {

    @FindBy(how = How.XPATH, using = "//div/div[2]/h1/a/span")
    private WebElement ybshouye;
    
    @FindBy(how = How.XPATH, using = "//body/div/div[2]/ul[1]/li[1]/a[1]")
    private WebElement zhushequ;
    
    @FindBy(how = How.XPATH, using = "//div[2]/ul[1]/li[2]/a[1]/u")
    private WebElement luntan;
    
    @FindBy(how = How.XPATH, using = "//div[1]/li[1]/div[1]/ul[1]/li[1]/a")
    private WebElement xiaoyuanhuodong;
    
    @FindBy(how = How.LINK_TEXT, using = "学校")
    private WebElement xuexiao;
    
    @FindBy(how = How.XPATH, using = "//div/div[2]/ul/li[4]/a[1]/u")
    private WebElement banji;
    
    @FindBy(how = How.LINK_TEXT, using = "手机易班")
    private WebElement shoujiyb;

    public FrontPage(WebDriver driver) {
        super(driver);
    }

    public void clickybshouye() {
    	ybshouye.click();       
        WebDriverWrapper.waitPageLoad(driver, 3);
    }

    public void clickzhushequ() {
    	zhushequ.click();
        WebDriverWrapper.waitPageLoad(driver, 3);

   }
    
    public void clickluntan() {
   // 	luntan.click();
    	WebDriverWrapper.hoverandclick(luntan, driver);
    	System.out.println("点中了");
    	xiaoyuanhuodong.click();
        WebDriverWrapper.waitPageLoad(driver, 2);

   }
    
    public void clickxuexiao() {
    	xuexiao.click();
        WebDriverWrapper.waitPageLoad(driver, 3);

   }
    
    public void clickbanji() {
    	banji.click();
        WebDriverWrapper.waitPageLoad(driver, 3);

   }

}
