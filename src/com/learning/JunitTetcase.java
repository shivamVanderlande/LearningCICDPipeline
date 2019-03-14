package com.learning;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class JunitTetcase {
	 @Test
		
	   public void testAdd() {
	      String str = "Junit is working fine";
	      assertEquals("Junit is working fine",str);
	   }
}
