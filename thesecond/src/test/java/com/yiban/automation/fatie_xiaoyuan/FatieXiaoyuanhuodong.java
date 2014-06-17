package com.yiban.automation.fatie_xiaoyuan;

import com.yiban.automation.testcase.AbstractfatieTestCase;

import org.junit.Test;

public class FatieXiaoyuanhuodong extends AbstractfatieTestCase {

	@Test
	public void testfatie() throws Exception {
		Login("nicheng", "123456");
		FaXinTie("花样篮球赛开赛了","请同学们踊跃报名！");
	}

}
