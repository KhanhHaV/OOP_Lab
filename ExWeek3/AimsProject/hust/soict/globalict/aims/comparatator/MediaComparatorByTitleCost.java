package aims.comparactor;

import java.util.Comparator;

import aims.media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media>{
    public int compare(Media media1, Media media2) {
        // Compare by title first
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());

        // If titles are equal, compare by cost
        if (titleComparison == 0) {
            return Double.compare(media1.getCost(), media2.getCost());
        }

        // Return the title comparison result for sorting
        return titleComparison;
    }
    
}