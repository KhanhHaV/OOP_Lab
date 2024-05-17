package aims.media;

import java.util.ArrayList;
import aims.media.*;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList <Track> trackList = new ArrayList<>();
    private int numberOfSong = 0;

    public String getArtist(){
        return artist;
    }

    public  CompactDisc(String title, String category, String director,String artist,int length, float cost) {
        super(title,category,director,length,cost);
        this.artist = artist;
    }


    public void addTrack(Track newTrack){
        for(Track eachTrack : trackList){
            if(eachTrack.isMatch(newTrack)){
                System.out.println("This track is already in the CD");
                return;
            }
        }
        trackList.add(newTrack); 
        numberOfSong++;
    }

    public void removeTrack(Track removalTrack){
        for(int i = 0; i < trackList.size(); i++){
            if(trackList.get(i).isMatch(removalTrack)){
                trackList.remove(i);
                numberOfSong--;
                return;
            }
        }
        System.out.println("Track not found in TrackList");
           
    }
    public String toString(int order){
       return( order + ".CompactDisc - " + this.getTitle() + " - " + this.getCategory()+ " - " + this.getDirector() +  " - " + this.getArtist() + " - " + this.getLength()+ " - " + this.getCost() + " $");
    }

    public int getLength(){
        int totalLength = 0;
        for(Track eachTrack : trackList){
            totalLength+=eachTrack.getLength();
        }
        return totalLength;
    }

    public void play(){
        System.out.println("=======START PLAY TRACKS LIST=======");
        for(Track track: trackList){
            track.play();
        }
    }
}
