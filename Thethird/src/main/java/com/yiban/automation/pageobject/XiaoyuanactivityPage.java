package com.yiban.automation.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.yiban.automation.utils.WebDriverWrapper;

public class XiaoyuanactivityPage extends FrontPage {

	@FindBy(how = How.XPATH, using = "//div[2]/ul[1]/li[2]/a/em")
	private WebElement luntan;

//	@FindBy(how = How.XPATH, using = "//div/li[1]/div/ul/li[2]/a/u")
//	private WebElement xinxianshi;

//	@FindBy(how = How.XPATH, using = "//div/li[1]/div/ul/li[3]/a/u")
//	private WebElement zipaixiu;

//	@FindBy(how = How.XPATH, using = "//div/li[1]/div/ul/li[4]/a/u")
//	private WebElement gongzuozhan;

//	@FindBy(how = How.XPATH, using = "//div/li[1]/div/ul/li[5]/a/u")
//	private WebElement dazahui;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/a")
	private WebElement newpen;
	
	@FindBy(how = How.XPATH, using = "//div[3]/div/div/div/a")
	private WebElement newtext;

	@FindBy(how = How.XPATH, using = "//div[2]/div/div/div/a[1]/span")
	private WebElement faxintie;

	// @FindBy(how = How.LINK_TEXT, using = "//div/div[1]/ul[1]/li[1]/a[1]/u")
	// private WebElement xintie;

	@FindBy(how = How.ID, using = "P_title")
	private WebElement ptitle;

	@FindBy(how = How.ID, using = "edui1_iframeholder")
	private WebElement content;

	@FindBy(how = How.LINK_TEXT, using = "发布")
	private WebElement fabu;

	public XiaoyuanactivityPage(WebDriver driver) {
		super(driver);
	}

	 public void clickluntan() {
//			driver.navigate().refresh();
			(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver driver) {
					return driver.findElement(By.cssSelector("ul.topnav li.topnavItem a.active"))
							.isDisplayed();
				}
			});	
			driver.findElement(By.cssSelector("ul.topnav li.topnavItem a.active")).click();
//			WebDriverWrapper.hold(luntan, driver);
//			((JavascriptExecutor)driver).executeScript("document.getElementsByTagName('em')[0].click();");
	//		WebDriverWrapper.waitPageLoad(driver, 3);
		//	luntan.click();
//			WebDriverWrapper.hoverandclick(luntan, driver);
			//try {
		//		WebDriverWrapper.doubleclick(luntan, driver);
		//	} catch (Exception e) {
				// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
			
			
			
	//		WebDriverWrapper.waitPageLoad(driver, 3);
			
//			luntan.sendKeys(Keys.RIGHT);
//			try {
//				WebDriverWrapper.rightclick(luntan,driver);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		//	(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
		//		public Boolean apply(WebDriver driver) {
		//			return driver.findElement(By.className("topnavItem")).findElement(By.linkText("论坛")).isDisplayed();
		//		}
		//	});
	//		luntan.click();
	 System.out.println("点中了luntan");
	 WebDriverWrapper.waitPageLoad(driver, 3);
	 }

	public XiaoyuanactivityPage clickxiaoyuanhuodong() {
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		// WebDriverWrapper.hoverandclick(huodong, driver);
		//
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li")).isDisplayed();
			}
		});

		driver.findElement(By.className("TFB_sub_li")).findElement(By.linkText("校园活动")).click();
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);

	}

	public XiaoyuanactivityPage clickfaxintie() {

		WebDriverWrapper.hoverandclick(faxintie, driver);
		// ((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;",
		// content);
		// ((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML",
		// faxintie);
		((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('it_bk')[0].click();");
		// xintie.click();
		System.out.println("点中了ss");
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public void shurutitle(String title) {
		ptitle.clear();
		ptitle.sendKeys(title);
		System.out.println("点中了title");
	}

	/*
	 * public void shurucontent() { System.out.println("点中了title1");
	 * ((JavascriptExecutor
	 * )driver).executeScript("arguments[0].checked = true;", content);
	 * driver.switchTo().frame(driver.findElement(By.id("baidu_editor_0")));
	 * System.out.println("点中了title3");
	 * driver.findElement(By.xpath("/html/body")
	 * ).sendKeys("周末打羽毛球的赶紧报名，名额有限，欲去请快！"); //do your stuff // content.clear();
	 * // System.out.println("点中了title2"); //
	 * ((JavascriptExecutor)driver).executeScript(
	 * "dom=(document.getElementById(\"baidu_editor_0\").firstChild.contentWindow).document.body"
	 * , "aaaaaaaa"); // content.sendKeys("周末打羽毛球的赶紧报名，名额有限，欲去请快！");
	 * driver.switchTo().defaultContent(); // System.out.println("点中了title4");
	 * // jQuery('iframe').contents().find('ul li a:eq(0)').click(); //
	 * content.clear(); // System.out.println("点中了title2"); //
	 * content.sendKeys("周末打羽毛球的赶紧报名，名额有限，欲去请快！"); //
	 * System.out.println("点中了title5"); // driver.switchTo("baidu_editor_0"); //
	 * @selenium.type
	 * "dom=(document.getElementById(\"SinaEditor_Iframe\").firstChild.contentWindow).document.body"
	 * , "aaaaaaaa"
	 * 
	 * 
	 * 
	 * }
	 */
	public XiaoyuanactivityPage huodongye() {
		// driver.navigate().refresh();
		// WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage xinxianshiye() {
		driver.navigate().refresh();
	//	WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		// WebDriverWrapper.hoverandclick(luntan, driver);

		// ((JavascriptExecutor)driver).executeScript("document.getElementsByXpath('//div/li[1]/div/ul/li[2]/a/u')[0].click();");

		// xinxianshi.click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li")).isDisplayed();
			}
		});

		driver.findElement(By.className("TFB_sub_li")).findElement(By.linkText("新鲜事")).click();
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage zipaixiuye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li")).isDisplayed();
			}
		});

		driver.findElement(By.className("TFB_sub_li")).findElement(By.linkText("自拍秀")).click();
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage gongzhuozhanye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.className("TFB_sub_li")).findElement(By.linkText("工作站")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage dazahuiye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.className("TFB_sub_li")).findElement(By.linkText("大杂烩")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage shumasheye() {
		driver.navigate().refresh();
//		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[2]/div/ul/li[1]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage gongyisheye() {
		driver.navigate().refresh();
//		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
//		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li")).isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[2]/div/ul/li[2]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage wudaosheye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[2]/div/ul/li[3]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage yingyueye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[2]/div/ul/li[4]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage dongmansheye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[2]/div/ul/li[5]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage lanqiusheye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[2]/div/ul/li[6]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage zuqiusheye() {
		driver.navigate().refresh();
//		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[2]/div/ul/li[7]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage zhuoyousheye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[2]/div/ul/li[8]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage xingzuoye() {
//		driver.navigate().refresh();
//		WebDriverWrapper.waitPageLoad(driver, 5);
//		WebDriverWrapper.hoverandclick(luntan, driver);
    	clickluntan();
//		driver.findElement(By.className("topnavItem")).findElement(By.linkText("论坛")).click();
		
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[3]/div/ul/li[1]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage chuangyiye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[3]/div/ul/li[2]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage meishiye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[3]/div/ul/li[3]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage zhuijuye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[3]/div/ul/li[4]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage gaoxiaoye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[3]/div/ul/li[5]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage youxiye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[3]/div/ul/li[6]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage kejiye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[3]/div/ul/li[7]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage shishangye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[3]/div/ul/li[8]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage shizhengye() {
		driver.navigate().refresh();
		WebDriverWrapper.hoverandclick(luntan, driver);
		clickluntan();
		WebDriverWrapper.waitPageLoad(driver, 3);
		(new WebDriverWait(driver, 12)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.className("TFB_sub_li"))
						.isDisplayed();
			}
		});

		driver.findElement(By.xpath("//div/ul/li[3]/div/ul/li[9]/a")).click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

	public XiaoyuanactivityPage faxintie(String title, String neirong) {

		clickfaxintie();
		WebDriverWrapper.waitPageLoad(driver, 3);
		shurutitle(title);
		// shurucontent();
		WebDriverWrapper.Contents(content, "baidu_editor_0", "/html/body",
				neirong, driver);
		fabu.click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}
	
	
	public XiaoyuanactivityPage newtext(String title, String neirong) {

		WebDriverWrapper.hoverandclick(newpen, driver);
//		WebDriverWrapper.hold(newpen, driver);
		WebDriverWrapper.hoverandclick(newtext, driver);
//		newpen.sendKeys(Keys.RIGHT);
		WebDriverWrapper.waitPageLoad(driver, 3);
	//	newpen.click();
	//	WebDriverWrapper.hold(newpen, driver);
//		(new WebDriverWait(driver, 5)).until(new ExpectedCondition<Boolean>() {
//			public Boolean apply(WebDriver driver) {
//				return driver.findElement(By.className("iwp_bgImg iwp_writer"))
//						.isDisplayed();
//			}
//		});
		
	   //	((JavascriptExecutor)driver).executeScript("(arguments[0]).fadeOut()",newpen);
		newtext.click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		shurutitle(title);
		// shurucontent();
		WebDriverWrapper.Contents(content, "baidu_editor_0", "/html/body",
				neirong, driver);
		fabu.click();
		WebDriverWrapper.waitPageLoad(driver, 3);
		return PageFactory.initElements(this.getDriver(),
				XiaoyuanactivityPage.class);
	}

}
