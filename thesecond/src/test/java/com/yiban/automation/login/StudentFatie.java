package com.yiban.automation.login;

import com.yiban.automation.testcase.AbstractfatieTestCase;

import org.junit.Test;

public class StudentFatie extends AbstractfatieTestCase {

	@Test
	public void testfatie() throws Exception {
		Login("lucklly@163.com", "123456");
		FaXinTie("打球不？","今天天气真的不错");
	}

}
