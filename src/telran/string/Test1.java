package telran.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	void testCharAtTest() {
		 assertEquals('J', "Java".charAt(0));
		 assertEquals('a', "Java".charAt(3));
	}

	@Test
	@Disabled
	void charAtOutOfBoundTest () {
		 assertEquals('x',"".charAt(0));
		 assertEquals('x', "Java".charAt(-1));
		 assertEquals('x', "Java".charAt(7));
	 }

	@Test
	void testCompareToTest() {
		 assertEquals(0, "Java".compareTo("Java"));
		 assertTrue("aaaa".compareTo("bb")<0);
		 assertFalse("aaaa".compareTo("bb")>0);
		 assertFalse("Java".compareTo("java")==0);
	}

	@Test
	void testCompareToIgnoreCaseTest() {
		 assertEquals(0, "HELLO".compareToIgnoreCase("HeLlo"));
		 assertFalse("HELLO".compareToIgnoreCase("Helo")==0);
		 assertEquals(0, "hello".compareToIgnoreCase("hello"));
	}

	@Test
	void testConcatTest() {
		 assertEquals("bbbaaa", "bbb".concat("aaa"));
		 assertEquals("".concat("xxxx"), "xxxx".concat(""));
	}

	@Test
	void testStartsWithTest() {
		 assertTrue("Javascript".startsWith("Java"));
		 assertFalse("Javascript".startsWith("java"));
		 assertTrue("XXXXXX".startsWith(""));
	}

	@Test
	void testEndWithTest() {
		 assertTrue("Javascript".endsWith("script"));
		 assertFalse("Javascript".endsWith("Script"));
	}

	@Test
	void testContainsTest() {
		 assertTrue("JavaScript".contains("vaScr"));
		 assertFalse("JavaScript".contains("vascr"));
		 assertTrue("JavaScript".contains(""));
	}

	@Test
	void testIndexOfTest() {
		 assertEquals(0, "JavaScript".indexOf("Ja"));
		 assertEquals(-1, "JavaScript".indexOf("ja"));
		 assertEquals(3, "JavaScript".indexOf("aSc", 2));
		 assertEquals(-1, "JavaScript".indexOf("asc", 5));
		 assertEquals(-1, "JavaScript".indexOf('f'));
		 assertEquals(1, "JavaScript".indexOf('a'));
		 assertEquals(3, "JavaScript".indexOf('a', 2));
	}

	@Test
	void testLastIndexOfTest() {
		 assertEquals(0, "JavaScript".lastIndexOf("Ja"));
		 assertEquals(-1, "JavaScript".lastIndexOf("ja"));
		 assertEquals(3, "JavaScript".lastIndexOf("aSc", 5));
		 assertEquals(-1, "JavaScript".lastIndexOf("aSc", 1));
		 assertEquals(-1, "JavaScript".lastIndexOf('f'));
		 assertEquals(3, "JavaScript".lastIndexOf('a'));
		 assertEquals(1, "JavaScript".lastIndexOf('a', 2));
		 assertEquals(3, "JavaScript".lastIndexOf('a', 5));
		 assertEquals(-1, "JavaScript".lastIndexOf('v', 1));
	}

}
