package com.example.javadummiesbook6.Chapter3;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Optional;

public class Chapter3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
//        Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked once.");
//        a.showAndWait();

        Alert a = new Alert(Alert.AlertType.INFORMATION, "Are you certain?", ButtonType.NO, ButtonType.YES);
        Optional<ButtonType> r = a.showAndWait();
        if (r.isPresent() && r.get() == ButtonType.YES) {
            Alert b = new Alert(Alert.AlertType.INFORMATION, "Thank you!");
            b.showAndWait();
        }
    }
}
