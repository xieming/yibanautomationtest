package com.yiban.automation.login;

import com.yiban.automation.testcase.AbstractLoginTestCase;

import org.junit.Test;

public class StudentLoginwrongpwdTest extends AbstractLoginTestCase {

	@Test
	public void testlogin() throws Exception {
		Login("test", "1111");
	}

}
