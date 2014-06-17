package com.yiban.automation.fatie;

import com.yiban.automation.testcase.AbstractbanjifatieTestCase;
import com.yiban.automation.testcase.AbstractfatieTestCase;

import org.junit.Test;

public class FatieBanjiTest extends AbstractbanjifatieTestCase {

	@Test
	public void testfatie() throws Exception {
		Login("nicheng", "123456");
		bjFaXinTie("班会活动","计划这个月组织一次班级活动");
	}

}
