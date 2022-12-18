package UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ParserPackage.PRNParser;

class TestPRNParser {

	@Test
	void testLineIsDone() {
<<<<<<< HEAD
	PRNParser parser =new PRNParser();
	assertEquals("Done", parser.parseLine("Arrow of God                               Achebe,Chinua                     385014805"));
	}
	
	void testLineIsIncomplete() {
		PRNParser parser =new PRNParser();
		assertEquals("Incomplete (incorrect size)",parser.parseLine( "Arrow of God Achebe,Chinua 385014805"));
	}
	
	void testLineIsError() {
		PRNParser parser =new PRNParser();
		assertEquals("Error (line is null)",parser.parseLine(null));
=======
		PRNParser parser = new PRNParser();
		assertEquals("Done", parser.parseLine("Arrow of God                               Achebe,Chinua                     385014805"));
>>>>>>> branch 'main' of https://github.com/Ido-Studies/Ruppin_SE_HW3.git
	}

}
