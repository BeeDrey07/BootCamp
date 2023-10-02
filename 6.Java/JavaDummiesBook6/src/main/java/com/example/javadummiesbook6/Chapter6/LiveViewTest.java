package com.example.javadummiesbook6.Chapter6;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class LiveViewTest extends Application {
    ListView list;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lbl = new Label("Pizza Toppings");
        list = new ListView();
        list.getItems().addAll("Sausage", "Pepperoni",
                "Linguica", "Salame", "Olives", "Mushrooms",
                "Onions", "Peppers", "Pineapple", "Spinach",
                "Canadian Bacon", "Tomatoes", "Kiwi",
                "Anchovies", "Gummy Bears");
        list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        list.setOnMouseClicked(e -> vbox_click());

//        HBox hbox = new HBox(10, lbl, list);
        VBox vbox = new VBox(10, lbl, list);

        Scene scene = new Scene(vbox, 500, 500);
//        list.setOrientation(Orientation.HORIZONTAL);

        primaryStage.setTitle("List View Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void vbox_click() {
        String tops = "";
        ObservableList<String> toppings = list.getSelectionModel().getSelectedItems();
        for(String s : toppings) {
            tops += s + "\n";
        }
        System.out.println("These are the toppings you chose: \n " + tops);
    }
}
