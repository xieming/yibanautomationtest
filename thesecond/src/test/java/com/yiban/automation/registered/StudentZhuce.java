package com.yiban.automation.registered;

import com.yiban.automation.testcase.AbstractLoginTestCase;
import com.yiban.automation.testcase.AbstractzhuceTestCase;

import org.junit.Test;

public class StudentZhuce extends AbstractzhuceTestCase {

	@Test
	public void testzhuce() throws Exception {
		Register("email2@163.com", "南瓜123", "123456", "123456");
	}

}
