package com.yiban.automation.fatie_shetuan;

import com.yiban.automation.testcase.AbstractfatieTestCase;
import com.yiban.automation.testcase.Abstractfatiedongmanshe;
import com.yiban.automation.testcase.Abstractfatieshumashe;
import com.yiban.automation.testcase.Abstractfatiexinxianshi;
import com.yiban.automation.testcase.Abstractfatiezipaixiu;
import com.yiban.automation.utils.WebDriverWrapper;

import org.junit.Test;
import org.openqa.selenium.By;

public class Shetuan_dongmanshe extends Abstractfatiedongmanshe {

	@Test
	public void testfatie() throws Exception {
		Login("nicheng", "123456");
		FaXinTie("谈谈你喜欢的动漫","新的动漫聪明的一休即将在各大影院上线了!有兴趣的同学一起来加群，群号：11111111");
	}

}
