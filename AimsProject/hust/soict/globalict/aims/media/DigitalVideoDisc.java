package aims.media;
import aims.media.* ;
public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(String title, String category,String director,int length, float cost) {
        super(title,category,director,length,cost);
    }
    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public String toString(int order){
       return (order+".CD - " +  this.getCategory()+ " - " + this.getDirector() + " - " + this.getLength()+ " - " + this.getCost() + " $");
    }
    
}
