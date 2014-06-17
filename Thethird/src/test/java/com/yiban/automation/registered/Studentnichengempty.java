package com.yiban.automation.registered;

import com.yiban.automation.testcase.AbstractLoginTestCase;
import com.yiban.automation.testcase.AbstractzhuceTestCase;

import org.junit.Test;

public class Studentnichengempty extends AbstractzhuceTestCase {

	@Test
	public void testzhuce() throws Exception {
		Register("weeh@163.com", "", "123456", "123456");
	}

}
