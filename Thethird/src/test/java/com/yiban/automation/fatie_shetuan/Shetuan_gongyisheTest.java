package com.yiban.automation.fatie_shetuan;

import com.yiban.automation.testcase.AbstractfatieTestCase;
import com.yiban.automation.testcase.Abstractfatiegongyishe;
import com.yiban.automation.testcase.Abstractfatieshumashe;
import com.yiban.automation.testcase.Abstractfatiexinxianshi;
import com.yiban.automation.testcase.Abstractfatiezipaixiu;
import com.yiban.automation.utils.WebDriverWrapper;

import org.junit.Test;
import org.openqa.selenium.By;

public class Shetuan_gongyisheTest extends Abstractfatiegongyishe {

	@Test
	public void testfatie() throws Exception {
		Login("nicheng", "123456");
		FaXinTie("农村支教活动报名","请有意向去农村支教的同学，去系辅导员处报名！");
	}

}
