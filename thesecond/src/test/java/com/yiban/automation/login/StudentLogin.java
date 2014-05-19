package com.yiban.automation.login;

import com.yiban.automation.testcase.AbstractLoginTestCase;

import org.junit.Test;

public class StudentLogin extends AbstractLoginTestCase {

	@Test
	public void testlogin() throws Exception {
		Login("lucklly@163.com", "123456");
	}

}
