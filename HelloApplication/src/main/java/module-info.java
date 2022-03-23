module com.example.helloapplication {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.helloapplication to javafx.fxml;
    exports com.example.helloapplication;


}