package ict.aimsprojectweek5.media;

import ict.aimsprojectweek5.Exception.PlayerException;

import javafx.scene.control.Alert;

public class DigitalVideoDisc extends Disc implements Playable {
    public DigitalVideoDisc(String title, String category,String director,int length, double cost) {
        super(title,category,director,length,cost);
    }

    public String toString(int order){
        return (order+".CD - " +  this.getCategory()+ " - " + this.getDirector() + " - " + this.getLength()+ " - " + this.getCost() + " $");
    }
    public void play() throws PlayerException {
        try {
            if(this.length > 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Play");

                // Header Text: null
                alert.setHeaderText(null);
                alert.setContentText("Playing " + this.getTitle() + "!");

                alert.showAndWait();
            } else {
                throw new PlayerException("ERROR: DVD length is non-positive!");
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
        System.out.print("DVD");
    }
}
