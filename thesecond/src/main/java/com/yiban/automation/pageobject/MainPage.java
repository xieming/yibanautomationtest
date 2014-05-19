package com.yiban.automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yiban.automation.utils.WebDriverWrapper;

public class MainPage extends Page {

    @FindBy(how = How.CLASS_NAME, using = "m_icon m_icon_p")
    private WebElement fatiezi;

    @FindBy(how = How.CLASS_NAME, using = "v3_radisu_button_span_border")
    private WebElement faxintie;

    @FindBy(how = How.LINK_TEXT, using = "校园活动")
    private WebElement xiaoyuanhuodong;
    
    @FindBy(how = How.NAME, using = "P_title")
    private WebElement tztitle;
    
    
    @FindBy(how = How.CLASS_NAME, using = "view")
    private WebElement tzcontent;
    
    @FindBy(how = How.LINK_TEXT, using = "发布")
    private WebElement fabubutton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickFatieziButton() {
    	fatiezi.click();       
        WebDriverWrapper.waitPageLoad(driver, 3);
        /*
         * if(TestConfiguration.browser.name().equals("ie")) {
         * WebDriverWrapper.executeJavaScript(driver,
         * "scilearn.learnerLogin.checkIfLoginIsNeeded('022'); return false;; return false;"
         * ); }
         */
    }

 //   public void clickfaxintieButton() {
//    	faxintie.click();
//        WebDriverWrapper.waitPageLoad(driver, 3);
        // if(TestConfiguration.browser.name().equals("ie")) {
        // WebDriverWrapper.executeJavaScript(driver,"scilearn.learnerLogin.submitLoginForm();; return false;");
        // }

//    }

    public MainPage login(String username, String password) {
    	driver.navigate().refresh();
  //  	System.out.println("haha");
        WebDriverWrapper.waitPageLoad(driver, 3);
        clickFatieziButton();
        WebDriverWrapper.waitPageLoad(driver, 3);
        faxintie.click();
        xiaoyuanhuodong.click();
        tztitle.clear();
        tztitle.sendKeys("想打球");
        tzcontent.sendKeys("想打羽毛球");
        fabubutton.click();
        
        
//        this.enterUsername(username);
        /*
         * if required to enter password which set by school manager on SLE
         */
//        this.enterPassword(password);
//        this.clickContinueButton();

        WebDriverWrapper.waitPageLoad(driver, 3);
        return PageFactory.initElements(this.getDriver(),
        		MainPage.class);
    }

}
