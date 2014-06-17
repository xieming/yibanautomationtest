package com.yiban.automation.fatie_xiaoyuan;

import com.yiban.automation.testcase.AbstractfatieTestCase;
import com.yiban.automation.testcase.Abstractfatiegongzuozhan;
import com.yiban.automation.testcase.Abstractfatiexinxianshi;
import com.yiban.automation.utils.WebDriverWrapper;

import org.junit.Test;
import org.openqa.selenium.By;

public class Fatiegongzuozhan extends Abstractfatiegongzuozhan {

	@Test
	public void testfatie() throws Exception {
		Login("nicheng", "123456");
		FaXinTie("机房要升级了","由于机房升级，今天3点到5点断网，请大家做好准备！");
	}

}
