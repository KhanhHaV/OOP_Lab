module com.example.guiproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens ict.javafx to javafx.fxml;
    exports ict.javafx;
}