package aims.store;

import java.util.ArrayList;

import  aims.media.*;

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
}
