package com.yiban.automation.fatie_xiaoyuan;

import com.yiban.automation.testcase.AbstractfatieTestCase;
import com.yiban.automation.testcase.Abstractfatiedazahui;
import com.yiban.automation.testcase.Abstractfatiexinxianshi;
import com.yiban.automation.utils.WebDriverWrapper;

import org.junit.Test;
import org.openqa.selenium.By;

public class Fatiedazahui extends Abstractfatiedazahui {

	@Test
	public void testfatie() throws Exception {
		Login("nicheng", "123456");
		FaXinTie("刘德华要来我校了","听说刘德华要来我校演讲了。具体日期不详，消息可靠度不详，消息来源，路边社");
	}

}
