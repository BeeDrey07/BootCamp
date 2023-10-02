package com.example.javadummiesbook6.Chapter4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class HBoxTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button One");
        Button btn2 = new Button("Button Two");
        Button btn3 = new Button("Button Three");

        //pane
        HBox hbox = new HBox(10, btn1, btn2, btn3);

//        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10));

        hbox.setPadding(new Insets(20,10,20,10));
//        hbox.getChildren().addAll(btn1, btn2, btn3);

        //scene
        Scene scene = new Scene(hbox, 750, 750);

        //stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("TESTING HBOX");
        primaryStage.show();
    }
}
