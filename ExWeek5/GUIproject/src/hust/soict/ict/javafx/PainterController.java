package ict.javafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.awt.event.MouseEvent;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup tools;



    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void changeColorToBlack(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void changeColorToWhite(ActionEvent event) {

    }

    @FXML
    void clearButtonPressed(ActionEvent event) {

    }
    public static void main(String[] args) {
        System.out.print("a");
    }

}
