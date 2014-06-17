package com.yiban.automation.luntan;

import junit.framework.Assert;

import com.yiban.automation.testcase.AbstractfatieTestCase;
import com.yiban.automation.utils.WebDriverWrapper;

import org.junit.Test;
import org.openqa.selenium.By;

public class Xiaoyuanxinxianshi extends AbstractfatieTestCase {

	@Test
	public void testfatie() throws Exception {
		Login("lucklly@163.com", "123456");
		WebDriverWrapper.waitPageLoad(driver, 5);
		driver.findElement(By.xpath("//div[2]/ul[1]/li[2]/a/u")).click();
		WebDriverWrapper.waitPageLoad(driver, 5);
        driver.findElement(By.xpath("//div/li[1]/div/ul/li[4]/a/u")).click();
   //     WebDriverWrapper.waitPageLoad(driver, 5);
 //       Assert.assertEquals("活动-易班网",driver.getTitle());
      //  driver.navigate().back();
	}

}
