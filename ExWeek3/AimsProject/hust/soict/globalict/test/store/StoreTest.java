package test.store;

import aims.media.*;
import aims.store.*;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Test addDVD method
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);

        // Test removeDVD method
        store.removeDVD(dvd1);
        store.removeDVD(dvd2);
    }
}