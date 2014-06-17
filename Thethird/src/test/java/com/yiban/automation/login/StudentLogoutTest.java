package com.yiban.automation.login;

import com.yiban.automation.testcase.AbstractLoginTestCase;
import com.yiban.automation.testcase.AbstractLogoutTestCase;

import org.junit.Test;

public class StudentLogoutTest extends AbstractLogoutTestCase {

	@Test
	public void testlogout() throws Exception {
		Loginandout("lucklly@163.com", "123456");
	}

}













