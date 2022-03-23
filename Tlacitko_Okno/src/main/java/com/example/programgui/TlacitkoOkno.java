package com.example.programgui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TlacitkoOkno extends Application {
    private Scene scene;

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage) throws Exception {

        Button tlac = new Button("Člověče, uděj zmáčk !");

        Font font = Font.font(20);

        tlac.setFont(font);

        tlac.setStyle("-fx-background-color: rgb(255, 255, 0)");

        tlac.setPrefSize(300, 50);


        tlac.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("  VAŠE ZAŘÍZENÍ JE ZABLOKOVÁNO !!!");

                // alert.setContentText("3mil Kč >> M_A_R_U_Š_K_A << PRO ODBLOKOVÁNÍ");
                alert.setContentText("3mil Kč >> Z_A_S_A_H_A_T_O_R << PRO ODBLOKOVÁNÍ");

                alert.show();

            }
        });
        FlowPane flowpane = new FlowPane(10, 10);
        flowpane.setAlignment(Pos.CENTER);
        flowpane.setStyle("-fx-background-color: rgb(0, 0, 0)");
        flowpane.getChildren().add(tlac);
        scene = new Scene(flowpane, 1920, 1080);
        stage.setScene(scene);
        stage.setTitle("Naše Okno");
        stage.show();
    }
}