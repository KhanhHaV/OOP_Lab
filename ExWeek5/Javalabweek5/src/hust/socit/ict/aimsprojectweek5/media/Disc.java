package ict.aimsprojectweek5.media;

public class Disc extends Media {
    protected int length;
    protected String director ;

    public Disc(String title, String category, String director, int length, double cost) {
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

    public static void main(String[] args) {
        System.out.print("disc");
    }
}

