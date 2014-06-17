package com.yiban.automation.fatie_xiaoyuan;

import com.yiban.automation.testcase.AbstractfatieTestCase;
import com.yiban.automation.testcase.Abstractfatiexinxianshi;
import com.yiban.automation.testcase.Abstractfatiezipaixiu;
import com.yiban.automation.utils.WebDriverWrapper;

import org.junit.Test;
import org.openqa.selenium.By;

public class FatiezipaixiuTest extends Abstractfatiezipaixiu {

	@Test
	public void testfatie() throws Exception {
		Login("nicheng", "123456");
		FaXinTie("教你如何拍出好看的照片","详细信息，请看易班数码社");
	}

}
