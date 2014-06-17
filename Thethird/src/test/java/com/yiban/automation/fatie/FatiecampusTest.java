


package com.yiban.automation.fatie;

import com.yiban.automation.testcase.AbstractbanjifatieTestCase;
import com.yiban.automation.testcase.AbstractfatieTestCase;
import com.yiban.automation.testcase.AbstractluntanTestCase;

import org.junit.Test;

public class FatiecampusTest extends AbstractluntanTestCase {

	@Test
	public void testluntanurl() throws Exception {
		Login("lucklly@163.com", "123456");
		LunTanURL();
	}

}
