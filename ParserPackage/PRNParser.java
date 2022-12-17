package ParserPackage;

import java.util.*;
public class PRNParser {
    String lastReadLine;
    String status;

    public PRNParser(){
        lastReadLine = null;
        status = "Completed";
    }

    public Book GetLastRead() {
        String nameOfTheBook = (lastReadLine.substring(0, 41));
        if(!(nameOfTheBook.endsWith(" ")))
            nameOfTheBook = nameOfTheBook + "...";
        nameOfTheBook = nameOfTheBook.trim();
        String authorName = lastReadLine.substring(42, 73);
        authorName = authorName.trim();
        int serialNumber = Integer.parseInt(lastReadLine.substring(74, 86).trim());

        return new Book(nameOfTheBook, authorName, serialNumber);
    }

    public String parseLine(String line) {
        lastReadLine = line;
        if(lastReadLine == null || lastReadLine.length() != 86)
            return status = "ERROR (line size or null)";
        if (lastReadLine.substring(0, 41).endsWith("..."))
            return status = "INCOMPLETE (incorrect size)";
        return status = "Done";
    }

}
