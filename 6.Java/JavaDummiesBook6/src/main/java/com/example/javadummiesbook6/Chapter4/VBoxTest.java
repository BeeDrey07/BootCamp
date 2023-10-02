package com.example.javadummiesbook6.Chapter4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button one");
        Button btn2 = new Button("Button two");
        Button btn3 = new Button("Button three");

//        VBox vbox = new VBox(10);
//        Scene scene = new Scene(vbox, 50, 50);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(btn1, btn2, btn3);
        Scene scene = new Scene(vbox, 750, 750);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.TOP_CENTER);

        primaryStage.setScene(scene);
        primaryStage.setTitle("vbox testing");
        primaryStage.show();
    }
}
