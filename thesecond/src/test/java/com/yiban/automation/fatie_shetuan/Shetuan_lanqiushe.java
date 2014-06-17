package com.yiban.automation.fatie_shetuan;

import com.yiban.automation.testcase.AbstractfatieTestCase;
import com.yiban.automation.testcase.Abstractfatielanqiushe;
import com.yiban.automation.testcase.Abstractfatieshumashe;
import com.yiban.automation.testcase.Abstractfatiexinxianshi;
import com.yiban.automation.testcase.Abstractfatiezipaixiu;
import com.yiban.automation.utils.WebDriverWrapper;

import org.junit.Test;
import org.openqa.selenium.By;

public class Shetuan_lanqiushe extends Abstractfatielanqiushe {

	@Test
	public void testfatie() throws Exception {
		Login("nicheng", "123456");
		FaXinTie("下午和信息工程学院的篮球赛取消","由于天公不作美，今天下午的篮球比赛取消，下次比赛要看情况而定。");
	}

}
