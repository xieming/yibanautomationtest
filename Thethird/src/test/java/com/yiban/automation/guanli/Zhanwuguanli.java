package com.yiban.automation.guanli;

import com.yiban.automation.testcase.AbstractZhanwumanageTestCase;
import com.yiban.automation.testcase.AbstractbanjifatieTestCase;
import com.yiban.automation.testcase.AbstractfatieTestCase;

import org.junit.Test;

public class Zhanwuguanli extends AbstractZhanwumanageTestCase {

	@Test
	public void testfatie() throws Exception {
		Login("noreason", "123456");
		ZWGL();
	}

}
