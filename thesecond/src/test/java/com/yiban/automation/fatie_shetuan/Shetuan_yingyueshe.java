package com.yiban.automation.fatie_shetuan;

import com.yiban.automation.testcase.AbstractfatieTestCase;
import com.yiban.automation.testcase.Abstractfatieshumashe;
import com.yiban.automation.testcase.Abstractfatiexinxianshi;
import com.yiban.automation.testcase.Abstractfatieyingyueshe;
import com.yiban.automation.testcase.Abstractfatiezipaixiu;
import com.yiban.automation.utils.WebDriverWrapper;

import org.junit.Test;
import org.openqa.selenium.By;

public class Shetuan_yingyueshe extends Abstractfatieyingyueshe {

	@Test
	public void testfatie() throws Exception {
		Login("nicheng", "123456");
		FaXinTie("笛子交流会","由市工会组织的笛子交流会在我院学术报告厅举行。有兴趣的同学情提前至系辅导员处报名。");
	}

}
