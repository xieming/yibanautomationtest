package com.yiban.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yiban.automation.utils.WebDriverWrapper;

public class BanjiactivityPage extends FrontPage {
 
   @FindBy(how = How.XPATH, using = "//div/ul[1]/li[1]/p/a")
    private WebElement banji;
    
    @FindBy(how = How.XPATH, using = "//div[1]/div[2]/ul[1]/li[4]/span/a")
    private WebElement tiezi;
    
    @FindBy(how = How.XPATH, using = "//div/div[1]/a[1]/span/span/span")
    private WebElement xintie;
    
    @FindBy(how = How.XPATH, using = "//body/div[3]/div[1]/div[2]/a[1]")
    private WebElement xuanbanji;
  
    
  //div/div[1]/a[1]/span/span/span
    
    @FindBy(how = How.ID, using = "P_title")
    private WebElement ptitle;

    @FindBy(how = How.ID, using = "edui1_iframeholder")
    private WebElement content;
    
    @FindBy(how = How.LINK_TEXT, using = "发布")
    private WebElement fabu;

    public BanjiactivityPage(WebDriver driver) {
        super(driver);
    }

 //   public void clickxiaoyuan() {
//    	xiaoyuan.click(); 
//    	System.out.println("点中了xiaoyuan");
//        WebDriverWrapper.waitPageLoad(driver, 3);
//    }

    
    public BanjiactivityPage xuanzhongbanji() {
    	banji.click();
    	System.out.println("点中了banji");
        WebDriverWrapper.waitPageLoad(driver, 3);
       
        return PageFactory.initElements(this.getDriver(),
        		BanjiactivityPage.class);

   }
    
    public BanjiactivityPage tieziclick() {
    	tiezi.click();
    	System.out.println("点中了tiezi");
        WebDriverWrapper.waitPageLoad(driver, 3);
       
        return PageFactory.initElements(this.getDriver(),
        		BanjiactivityPage.class);

   }
    
    public BanjiactivityPage clickfaxintie()
    {
    System.out.println("ca");
 //   WebDriverWrapper.hoverandclick(xintie, driver);
    xintie.click();
    WebDriverWrapper.waitPageLoad(driver, 3);
	System.out.println("点中了");
//	((JavascriptExecutor)driver).executeScript("document.getElementsByXpath(xintie)[0].click();");
	xuanbanji.click();
	System.out.println("点中了");
    WebDriverWrapper.waitPageLoad(driver, 2);
    return PageFactory.initElements(this.getDriver(),
    		BanjiactivityPage.class);
    }


 /*   public BanjiactivityPage clickfaxintie() {
    	
    	WebDriverWrapper.hoverandclick(faxintie, driver);
//    	((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", content);
 //   	((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML", faxintie);
    	((JavascriptExecutor)driver).executeScript("document.getElementsByClassName('it_bk')[0].click();");
  //  	xintie.click();
    	System.out.println("点中了ss");
        WebDriverWrapper.waitPageLoad(driver, 3);
        return PageFactory.initElements(this.getDriver(),
        		BanjiactivityPage.class);
    }
    */

   
    
    public void shurutitle(String title) {
    	ptitle.clear();
    	ptitle.sendKeys(title);
    	System.out.println("点中了title");
   }
    
   /* public void shurucontent() {
    	System.out.println("点中了title1");
    	((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", content);
    	driver.switchTo().frame(driver.findElement(By.id("baidu_editor_0")));
    	System.out.println("点中了title3");
    	driver.findElement(By.xpath("/html/body")).sendKeys("周末打羽毛球的赶紧报名，名额有限，欲去请快！");
    	//do your stuff
 //   	content.clear();
 //   	System.out.println("点中了title2");
//    	((JavascriptExecutor)driver).executeScript("dom=(document.getElementById(\"baidu_editor_0\").firstChild.contentWindow).document.body", "aaaaaaaa");
//    	content.sendKeys("周末打羽毛球的赶紧报名，名额有限，欲去请快！");
    	driver.switchTo().defaultContent();
 //   	System.out.println("点中了title4");
  //  	jQuery('iframe').contents().find('ul li a:eq(0)').click();
 //   	content.clear();
 //   	System.out.println("点中了title2");
  //  	content.sendKeys("周末打羽毛球的赶紧报名，名额有限，欲去请快！");
  //  	System.out.println("点中了title5");
 //   	driver.switchTo("baidu_editor_0");
   //     @selenium.type "dom=(document.getElementById(\"SinaEditor_Iframe\").firstChild.contentWindow).document.body", "aaaaaaaa"
    	
    	
    
   }
 */   
    public BanjiactivityPage banjifaxintie (String title, String neirong) {
    	driver.navigate().refresh();
    	clickbanji();
    	xuanzhongbanji();
    	tieziclick();
    	clickfaxintie();
    	shurutitle(title);
 //   	shurucontent();
    	WebDriverWrapper.Contents(content, "baidu_editor_0", "/html/body", neirong , driver);
    	WebDriverWrapper.waitPageLoad(driver, 3);
    	fabu.click();
    	WebDriverWrapper.waitPageLoad(driver, 3);
        return PageFactory.initElements(this.getDriver(),
        		BanjiactivityPage.class);
    }

}
