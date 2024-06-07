package ict.aimsprojectweek5.media;
import javafx.scene.control.Alert;
import ict.aimsprojectweek5.Exception.PlayerException;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList <Track> trackList = new ArrayList<>();
    private int numberOfSong = 0;

    public String getArtist(){
        return artist;
    }

    public  CompactDisc(String title, String category, String director,String artist,int length, double cost) {
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

    public void play() throws PlayerException {
        try {
            if(this.getLength() > 0) {
                java.util.Iterator iter = trackList.iterator();
                Track nextTrack;
                while (iter.hasNext()) {
                    nextTrack = (Track) iter.next();
                    try {
                        nextTrack.play();
                    } catch (PlayerException e) {
                        throw e;

                    }
                }

            } else {
                throw new PlayerException("ERROR: CD length is non-positive!");
            }
        } catch (PlayerException e) {
            System.err.println(e.getMessage());
            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("Error");
            alert.setHeaderText(e.getMessage());
            alert.showAndWait();
        }
    }
    public static void main(String[] args) {
        System.out.print("CD");
    }
}

