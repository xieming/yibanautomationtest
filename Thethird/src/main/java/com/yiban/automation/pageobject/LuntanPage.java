package com.yiban.automation.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yiban.automation.utils.WebDriverWrapper;

public class LuntanPage extends Page {

  
    @FindBy(how = How.LINK_TEXT, using = "发新贴")
    private WebElement faxintie;
    
    @FindBy(how = How.LINK_TEXT, using = "新贴")
    private WebElement xintie;
    
    @FindBy(how = How.ID, using = "P_title")
    private WebElement ptitle;

    @FindBy(how = How.ID, using = "edui1_iframeholder")
    private WebElement content;
    
    public LuntanPage(WebDriver driver) {
        super(driver);
    }

    public void clickfaxintie() {
    	faxintie.click();       
        WebDriverWrapper.waitPageLoad(driver, 3);
    }

    
    public void clickxintie() {
    	xintie.click();
        WebDriverWrapper.waitPageLoad(driver, 3);

   }
    
    public void shurutitle() {
    	ptitle.clear();
    	ptitle.sendKeys("周末去打羽毛球么？");

   }
    
    public void shurucontent() {
    	content.clear();
    	((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", content);
    	content.sendKeys("周末打羽毛球的赶紧报名，名额有限，欲去请快！");
 //   	driver.switchTo("baidu_editor_0");
   //     @selenium.type "dom=(document.getElementById(\"SinaEditor_Iframe\").firstChild.contentWindow).document.body", "aaaaaaaa"
    
    }

}
