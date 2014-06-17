package com.yiban.automation.fatie_xingqu;

import com.yiban.automation.testcase.Abstractfatiexingzuo;

import org.junit.Test;

public class xingqu_xinzuo extends Abstractfatiexingzuo {

	@Test
	public void testfatie() throws Exception {
		Login("nicheng", "123456");
		FaXinTie("说说你是那个星座的？", "我觉得双鱼座的人最有福");
	}

}
