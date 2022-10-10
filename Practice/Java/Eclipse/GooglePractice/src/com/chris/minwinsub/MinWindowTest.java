package com.chris.minwinsub;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MinWindowTest {

	@Test
	void testMinWindow() {
		//assertEquals("BANC",MinWindow.minWindow("ADOBECODEBANC", "ABC"));
		assertEquals("",MinWindow.minWindow("a", "aa"));
	}

}
