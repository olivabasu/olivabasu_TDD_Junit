package com.epam.Remove_A_FromFirst2Char;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove_A_FromFirst2CharTest {
	
	/*TODOlist for my feature
	 * 1. ABCD => BCD
	 * 2. AACD => CD
	 * 3. BACD => BCD
	 * 4. BBAA => BBAA
	 * 5. AABAA => BAA
	 * 6. A     => ""
	 * 7. B     => B
	 * 8. ""    => ""
	 * 9. AA    => ""
	 */
	Remove_A_FromFirst2Char obj;
	
	@BeforeEach
	void setUp() {
		obj=new Remove_A_FromFirst2Char();
	}
	
	
	@Test
	void test1() {
		assertEquals("BCD",obj.remove("ABCD"));
	}
	
	@Test
	void test2() {
		assertEquals("CD",obj.remove("AACD"));
	}
	
	@Test
	void test3() {
		assertEquals("BCD",obj.remove("BACD"));
	}
	
	@Test
	void test4() {
		assertEquals("BBAA",obj.remove("BBAA"));
	}
	
	@Test
	void test5() {
		assertEquals("BAA",obj.remove("AABAA"));
	}
	
	@Test
	void test6() {
		assertEquals("",obj.remove("A"));
	}
	
	@Test
	void test7() {
		assertEquals("B",obj.remove("B"));
	}
	
	@Test
	void test8() {
		assertEquals("",obj.remove(""));
	}
	
	@Test
	void test9() {
		assertEquals("",obj.remove("AA"));
	}

}
