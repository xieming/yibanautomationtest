package com.yiban.automation.fatie_shetuan;

import com.yiban.automation.testcase.AbstractfatieTestCase;
import com.yiban.automation.testcase.Abstractfatieshumashe;
import com.yiban.automation.testcase.Abstractfatiewudaoshe;
import com.yiban.automation.testcase.Abstractfatiexinxianshi;
import com.yiban.automation.testcase.Abstractfatiezipaixiu;
import com.yiban.automation.utils.WebDriverWrapper;

import org.junit.Test;
import org.openqa.selenium.By;

public class Shetuan_wudaosheTest extends Abstractfatiewudaoshe {

	@Test
	public void testfatie() throws Exception {
		Login("nicheng", "123456");
		FaXinTie("喜欢瑜伽的同学有福了。","舞蹈社请到了我市著名的瑜伽老师，王老师来我院讲课。地点：文体中心三楼201室，时间，周三下午2：00");
	}

}
