package aims.comparactor;

import java.util.Comparator;
import aims.media.*;


public class MediaComparatorByCostTitle implements Comparator<Media> {
    public int compare(Media media1, Media media2) {
        // Compare by cost first
        int costComparison = Double.compare(media1.getCost(), media2.getCost());

        // If costs are equal, compare by title
        if (costComparison == 0) {
            return media1.getTitle().compareTo(media2.getTitle());
        }

        // Return the cost comparison result for sorting
        return costComparison;
    }
}