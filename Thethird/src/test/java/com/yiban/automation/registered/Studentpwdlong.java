package com.yiban.automation.registered;

import com.yiban.automation.testcase.AbstractLoginTestCase;
import com.yiban.automation.testcase.AbstractzhuceTestCase;

import org.junit.Test;

public class Studentpwdlong extends AbstractzhuceTestCase {

	@Test
	public void testzhuce() throws Exception {
		Register("weeh@163.com", "tian", "1234567890abcdefghi", "1234567890abcdefghi");
	}

}
