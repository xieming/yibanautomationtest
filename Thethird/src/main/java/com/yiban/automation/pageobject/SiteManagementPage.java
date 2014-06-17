

package com.yiban.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yiban.automation.utils.WebDriverWrapper;

public class SiteManagementPage extends FrontPage {
 
   @FindBy(how = How.XPATH, using = "//div/div[1]/div[1]/div[1]/div[2]/div/a")
    private WebElement zwmanage;
    
  
 

    public SiteManagementPage(WebDriver driver) {
        super(driver);
    }

 //   public void clickxiaoyuan() {
//    	xiaoyuan.click(); 
//    	System.out.println("点中了xiaoyuan");
//        WebDriverWrapper.waitPageLoad(driver, 3);
//    }

    
    public SiteManagementPage zwguanliClick() {
    	zwmanage.click();
    	System.out.println("点中了banji");
        WebDriverWrapper.waitPageLoad(driver, 3);
       
        return PageFactory.initElements(this.getDriver(),
        		SiteManagementPage.class);

   }
    

    public SiteManagementPage zhanwuguanli() {
    	driver.navigate().refresh();
    	clickzhushequ();
    	zwguanliClick();
    	WebDriverWrapper.waitPageLoad(driver, 3);
        return PageFactory.initElements(this.getDriver(),
        		SiteManagementPage.class);
    }

}
