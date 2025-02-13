package com.example.javadummiesbook6.Chapter4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class HBoxSpacerTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Create the buttons
        Button btn1 = new Button("One");
        Button btn2 = new Button("Two");
        Button btn3 = new Button("Three");
        // Create the spacer
        Region spacer = new Region();

        // Create the HBox layout pane
        HBox hBox = new HBox(10, btn1, btn2, spacer, btn3);
// Set the margins
        hBox.setMargin(btn1, new Insets(10));
        hBox.setMargin(btn2, new Insets(10));
        hBox.setMargin(btn3, new Insets(10));
// Set the Hgrow for the spacer
        hBox.setHgrow(spacer, Priority.ALWAYS);

        Scene scene = new Scene(hBox, 750, 750);

        //stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("TESTING HBOX");
        primaryStage.show();

    }
}

