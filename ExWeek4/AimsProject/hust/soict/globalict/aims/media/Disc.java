package aims.media;

public class Disc extends Media {
    private int length;
    private String director ;

    public Disc(String title, String category, String director, int length, float cost) {
        super(title,category,cost);
        this.director = director;
        this.length = length;
       
    }

    public int getLength()
    {
        return length ;
    }
    public String getDirector(){
        return director ; 
    }

    public boolean isMatchItem(Disc item) {
        return this.id == item.id &&
        this.title.equals(item.getTitle())&& 
        this.category.equals(item.getCategory()) &&
        this.cost == item.cost && 
        this.director.equals(item.getDirector()) && 
        this.length == item.length;
    }
}
