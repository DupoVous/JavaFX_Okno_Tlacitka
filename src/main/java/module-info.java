module com.example.javafx_okno_tlacitka {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_okno_tlacitka to javafx.fxml;
    exports com.example.javafx_okno_tlacitka;
}