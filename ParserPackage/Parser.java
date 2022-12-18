package ParserPackage;

public class Parser {
	private PRNParser parser;
	private Book lastBook;
	
	public Parser() {
		parser = new PRNParser();
	}
	
	public Book readLine(String line) {
		if(parser.status.equals("Done") || parser.status.equals("Error")) {
			parser.parseLine(line);
			lastBook = parser.GetLastRead();
		}
		else {
			parser.parseLine(line);
			lastBook.nameOfTheBook += parser.lastReadLine;
		}
		return lastBook;
	}
	
}
