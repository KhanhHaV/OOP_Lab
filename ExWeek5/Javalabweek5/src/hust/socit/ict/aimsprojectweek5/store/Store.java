package ict.aimsprojectweek5.store;


import java.util.ArrayList;

import  ict.aimsprojectweek5.media.*;

public class Store {
    private int qtyItem = 0;
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media newMedia){
        for (Media eachMedia : itemsInStore){
            if (eachMedia.isMatchItem(newMedia)){
                System.out.println("This item is already in the store");
                return;
            }
            itemsInStore.add(newMedia);
            qtyItem++;
        }

    }

    public void removeMedia(Media media) {
        boolean found = false;
        for (int i = 0; i < itemsInStore.size(); i++) {
            if (itemsInStore.get(i).isMatchItem(media)) {
                itemsInStore.remove(i);
                qtyItem--;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in store");
        }
    }

    public void listItem() {
        if (qtyItem <= 0) {
            System.out.println("There are no items in the store.");
        } else {
            System.out.println("*********************** STORE ***********************");
            System.out.println("Store");
            int cnt = 1;
            for (Media media : itemsInStore) {
                media.toString(cnt);
                cnt++;
            }
        }
    }

    public Media searchMedia(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }


    public void initData() {
        // Khởi tạo 10 sách
        addMedia(new Book(1, "Java Programming", "Education", 25.0, 123));
        addMedia(new Book(2, "Python Basics", "Education", 20.0, 124));
        addMedia(new Book(3, "Data Structures", "Education", 30.0, 125));
        addMedia(new Book(4, "Algorithms", "Education", 28.0, 126));
        addMedia(new Book(5, "Machine Learning", "Education", 35.0, 127));
        addMedia(new Book(6, "History of Art", "History", 18.0, 128));
        addMedia(new Book(3, "A", "Education", 30.0, 125));
        addMedia(new Book(4, "B", "Education", 28.0, 126));
        addMedia(new Book(5, "C", "Education", 35.0, 127));
        addMedia(new Book(6, "D", "History", 18.0, 128));



        // Khởi tạo 5 DigitalVideoDisc
        addMedia(new DigitalVideoDisc("The Matrix", "Action", "Wachowski Brothers", 120, 15.0));
        addMedia(new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 150, 18.0));
        addMedia(new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 180, 20.0));
        addMedia(new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 140, 16.0));
        addMedia(new DigitalVideoDisc("Pulp Fiction", "Crime", "Quentin Tarantino", 160, 17.0));

        // Khởi tạo 5 CompactDisc
        CompactDisc cd1 = new CompactDisc("Album A", "Pop", "Singer A", "Band A", 60, 12.0);
        cd1.addTrack(new Track("Song 1", 4));
        cd1.addTrack(new Track("Song 2", 5));
        cd1.addTrack(new Track("Song 3", 3));
        addMedia(cd1);

        CompactDisc cd2 = new CompactDisc("Album B", "Rock", "Singer B", "Band B", 65, 14.0);
        cd2.addTrack(new Track("Track 1", 4));
        cd2.addTrack(new Track("Track 2", 5));
        cd2.addTrack(new Track("Track 3", 3));
        addMedia(cd2);

        CompactDisc cd3 = new CompactDisc("Album C", "Jazz", "Singer C", "Band C", 70, 16.0);
        cd3.addTrack(new Track("Jazz 1", 4));
        cd3.addTrack(new Track("Jazz 2", 5));
        cd3.addTrack(new Track("Jazz 3", 3));
        addMedia(cd3);

        CompactDisc cd4 = new CompactDisc("Album D", "Hip-hop", "Singer D", "Band D", 55, 13.0);
        cd4.addTrack(new Track("Hip-hop 1", 4));
        cd4.addTrack(new Track("Hip-hop 2", 5));
        cd4.addTrack(new Track("Hip-hop 3", 3));
        addMedia(cd4);

        CompactDisc cd5 = new CompactDisc("Album E", "Classical", "Singer E", "Band E", 75, 10.1);
        cd5.addTrack(new Track("Classical 1", 4));
        cd5.addTrack(new Track("Classical 2", 5));
        cd5.addTrack(new Track("Classical 3", 3));
        addMedia(cd5);
    }
    public static void main(String[] args) {
        System.out.print("store");
    }
}

