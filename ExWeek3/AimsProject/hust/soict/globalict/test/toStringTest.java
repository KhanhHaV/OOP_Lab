package test;

import java.util.ArrayList;
import java.util.List;

import aims.media.*;

public class toStringTest {

    static List<Media> mediae = new ArrayList<>();
    public static void main(String[] args) {
        CompactDisc cd = new CompactDisc("A", "B", "C", "D", 0, 0);
    Book book  = new Book("A", "B",  0, 0);
    DigitalVideoDisc dvd = new DigitalVideoDisc("A", "B", "C", 0, 0);
    mediae.add(cd);
    mediae.add(book);
    mediae.add(dvd);

    int i = 1;
    for (Media eachMedia : mediae) {
        System.out.println(eachMedia.toString(i));
        i++;
    }
    
    }
    

}
