package com.yiban.automation.login;

import com.yiban.automation.testcase.AbstractbanjifatieTestCase;
import com.yiban.automation.testcase.AbstractfatieTestCase;

import org.junit.Test;

public class BanjiFatie extends AbstractbanjifatieTestCase {

	@Test
	public void testfatie() throws Exception {
		Login("noreason", "123456");
		bjFaXinTie("校园活动","今天天气真的不错");
	}

}
