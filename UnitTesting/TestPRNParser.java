package UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ParserPackage.PRNParser;

class TestPRNParser {

	@Test
	void testLineIsDone() {
		PRNParser parser = new PRNParser();
		assertEquals("Done", parser.parseLine("Arrow of God                               Achebe,Chinua                     385014805"));
	}

}
