package com.yiban.automation.registered;

import com.yiban.automation.testcase.AbstractLoginTestCase;
import com.yiban.automation.testcase.AbstractzhuceTestCase;

import org.junit.Test;

public class Studentmailwrong extends AbstractzhuceTestCase {

	@Test
	public void testzhuce() throws Exception {
		Register("weeh@164@.com", "南瓜123", "123456", "123456");
	}

}
