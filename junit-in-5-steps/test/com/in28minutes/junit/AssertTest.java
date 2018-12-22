package com.in28minutes.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		boolean condn = true;
		assertEquals(true,condn);
		assertTrue(condn);
		assertFalse(condn);
		assertNotNull(condn);
		assertNull(condn);
		//assertArrayEquals(array1,array2);
	}

}
