module ict.example.aimsprojectweek5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens ict.aimsprojectweek5 to javafx.fxml;
    exports ict.aimsprojectweek5;
}