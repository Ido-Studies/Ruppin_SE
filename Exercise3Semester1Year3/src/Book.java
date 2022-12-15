import java.util.*;
public class Book {
    String nameOfTheBook;
    String authorName;
    int serialNumber;

    public Book(String name, String author, int serial) {
        nameOfTheBook = name;
        authorName = author;
        serialNumber = serial;
    }

    public String toString() {
        return ("name of the book= " + nameOfTheBook + "\nname of the author = " + authorName + "\nserial number = " + serialNumber);
    }



    public static void main (String[] args) {
        String strDone = "Arrow of God                               Achebe,Chinua                     385014805";
        String strErrorNull = null;
        String strErrorLengthShort = "Arrow of God Achebe,Chinua 385014805";
        String strErrorLengthLong = "Arrow of God                               Achebe,Chinua                       385014805";
        PRNParser parser = new PRNParser();
        System.out.println(strErrorLengthLong.length());
        System.out.println(parser.parseLine(strErrorLengthLong));
       // System.out.println(str.length());
        //Book LastBook=GetLastRead(str);
        // System.out.println(LastBook);

    }
}


