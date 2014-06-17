package com.yiban.automation.pageobject;

import java.util.NoSuchElementException;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yiban.automation.utils.TestDB;
import com.yiban.automation.utils.WebDriverWrapper;

public class ZhucePage extends Page {

	@FindBy(how = How.XPATH, xpath = "//div/div[2]/ul[3]/li[2]/a/u")
	private WebElement zhuceButton;

	@FindBy(how = How.XPATH, xpath = "//div[2]/div/a[1]")
	private WebElement newstudent;

	//@FindBy(how = How.XPATH, using = "//form/div[7]/input")
	//private WebElement mailyzm;

	@FindBy(how = How.XPATH, using = "//form/div[1]/input")
	private WebElement email;

	@FindBy(how = How.XPATH, using = "//form/div[2]/div[1]/input[1]")
	private WebElement school;
	
	@FindBy(how = How.XPATH, using = "//div/div[2]/ul/li[1]/a")
	private WebElement xuanschool;

	@FindBy(how = How.XPATH, using = "//form/div[2]/div[2]/input[1]")
	private WebElement xueyuan;
	
	@FindBy(how = How.XPATH, using = "//div/div[2]/div/div/ul/li[4]/a")
	private WebElement xuanxueyuan;

	@FindBy(how = How.XPATH, using = "//form/div[3]/input")
	private WebElement nicheng;

	@FindBy(how = How.XPATH, using = "//form/div[4]/input")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//form/div[5]/input")
	private WebElement confirmpwd;

	@FindBy(how = How.XPATH, using = "//form/div[7]/div")
	private WebElement sentyzm;

	@FindBy(how = How.XPATH, using = "//form/div[7]/input")
	private WebElement tianyzm;

	@FindBy(how = How.XPATH, using = "//form/div[8]/a")
	private WebElement zcbutton;

	public ZhucePage(WebDriver driver) {
		super(driver);
	}

	public ZhucePage clickZhuCeButton() {
		zhuceButton.click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(), ZhucePage.class);
	}

	public ZhucePage clicknewstudentButton() {
		newstudent.click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(), ZhucePage.class);

	}

	public void zcyouxiang(String username) {
		email.clear();
		email.sendKeys(username);
		
	}

	public void zcschool() {
		school.click();
		WebDriverWrapper.waitPageLoad(driver, 2);
		xuanschool.click();
		WebDriverWrapper.waitPageLoad(driver, 3);
	}

	public void zcxueyuan() {
		xueyuan.click();		
		WebDriverWrapper.waitPageLoad(driver, 2);
		xuanxueyuan.click();
		WebDriverWrapper.waitPageLoad(driver, 2);
	}

	public void zcnicheng(String username) {
		System.out.println("oh1");
		nicheng.clear();
		System.out.println("oh2");
		nicheng.sendKeys(username);
	}

	public void zcpwd(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}

	public void zccomfirmpwd(String message) {
		confirmpwd.clear();
		confirmpwd.sendKeys(message);
	}

	public void sentyzmButton() {
		sentyzm.click();
		WebDriverWrapper.waitPageLoad(driver, 3);
	}

	public void fillyzm(String yzm) {
		tianyzm.clear();
		tianyzm.sendKeys(yzm);
	}

	public ZhucePage registnow() {
		System.out.println("hahaa");
		new Actions(driver).moveToElement(zcbutton).click().perform();
		zcbutton.click();
		System.out.println("hahaa1");
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(), ZhucePage.class);
	}

	public ZhucePage zhuce(String email, String nichen, String password, String conpwd) {
		driver.navigate().refresh();
		System.out.println("haha");
		WebDriverWrapper.waitPageLoad(driver, 3);
		clickZhuCeButton();
		clicknewstudentButton();
		WebDriverWrapper.waitPageLoad(driver, 3);
		System.out.println("hello");
		zcyouxiang(email);
	//	if (driver.findElement(By.xpath("//form/div[1]/span[2]/table/tbody/tr/td")) != null) {
	//		System.out.println("您输入的账号或密码不正确，请重新输入");
	//	}
//		if (driver.findElement(By.cssSelector("span.style.visible")) != null) {
	//		System.out.println("您输入的账号或密码不正确，请重新输入");
//		}
//		WebElement element = driver.findElement(By.tagName("td")).findElement(By.linkText("请输入正确地邮箱地址！"));
//		System.out.println(element.isDisplayed());
//		if (element.isDisplayed())
//		{
//			System.out.println("请输入正确地邮箱地址！");
//		}
		
	/*	try{	
            driver.findElement(By.xpath("//form/div[1]/span[2]/table/tbody/tr/td"));
            System.out.println("请输入正确的邮箱地址");
        } catch(NoSuchElementException e){
            System.out.println("reg_ml_tips does not exist");
        }
        */
		zcschool();
	//	String actualTest = driver.findElement(By.tagName("td")).getText();
	//			if (Assert.assertEquals("请输入正确的邮箱地址", actualTest))
	//			{
	//				System.out.println("请输入正确的邮箱地址");
	//			}
    //    try{
		//        driver.findElement(By.xpath("//form/div[2]/div[1]/span[2]/table/tbody/tr/td"));
		//       System.out.println("请选择你的学校");
		//    } catch(NoSuchElementException e){
		//       System.out.println("reg_ml_tips does not exist");
		//   }
	//	zcxueyuan();
		//  try{
		//     driver.findElement(By.xpath("//form/div[2]/div[1]/span[2]/table/tbody/tr/td"));
		//      System.out.println("请在弹框中选择学院");
		// } catch(NoSuchElementException e){
		//   System.out.println("reg_ml_tips does not exist");
		//  }
        zcnicheng(nichen);
        //  try{
        //     driver.findElement(By.xpath("//form/div[3]/span[1]"));
        //     System.out.println("非法昵称，昵称为4-17个字符的中文、英文或者数字");
        // } catch(NoSuchElementException e){
        //    System.out.println("reg_ml_tips does not exist");
        //}
		zcpwd(password);
		zccomfirmpwd(conpwd);
		sentyzmButton();
		WebDriverWrapper.waitPageLoad(driver, 3);
		TestDB tt = new TestDB();
		String code = tt.checkcode("select checkcode from reg_check_email order by create_time desc limit 1 ");
		System.out.println(code);
		fillyzm(code);
		registnow();
		System.out.println(code);
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(), ZhucePage.class);
	}

}
