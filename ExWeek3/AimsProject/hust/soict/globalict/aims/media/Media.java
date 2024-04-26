package aims.media;

import java.util.ArrayList;
import java.util.Comparator;

import aims.comparactor.*;
import aims.media.*;

public class Media {
    public int id;
    public String title;
    public String category;
    public float cost;

    public Media( String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    
    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isMatchItem(Media item) {
        return this.id == item.id &&
            this.title.equals(item.title) && 
            this.category.equals(item.category) &&
            this.cost == item.cost; 
    }
    public String toString(int order) {
        return(order + ".Media - " + title + " - " + category + " - " + cost + " $");
    }
    //overide
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return title.equals(media.title);
    }

    //sort
    public static final Comparator<Media> Compare_By_Title_Cost = new MediaComparatorByTitleCost();
    public static final Comparator<Media> Compare_By_Cost_Title = new MediaComparatorByCostTitle();
}