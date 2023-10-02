package com.example.javadummiesbook6.Chapter6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceBoxTest extends Application {
    ChoiceBox<String> choice;
    ChoiceBox<Astronaut> apollo13;
    ChoiceBox<ZooAnimal> happyZoo;
    Label lbl;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        lbl = new Label();
        choice = new ChoiceBox<String>();
        choice.getItems().addAll("Bashful", "Doc", "Dopey", "Grumpey", "Happy", "Sleepy", "Sneezy");
        choice.setValue("Sleepy");
        lbl.setText("Today is " + choice.getValue() + "'s turn to clean");
        choice.getSelectionModel().selectedItemProperty()
                .addListener((v, oldValue, newValue) ->
                        lbl.setText("Today is " + newValue + "'s turn to clean."));
        choice.setOnAction(e -> dwarf_Click());
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(choice, lbl);

        apollo13 = new ChoiceBox<Astronaut>();
        Astronaut lovell = new Astronaut("Jim", "Lovell");
        Astronaut swigert = new Astronaut("John", "Swigert");
        Astronaut haise = new Astronaut("Fred", "Haise");
        apollo13.getItems().addAll(lovell, swigert, haise);
        apollo13.setValue(lovell);
        apollo13.setOnAction(e -> astronaut_click());

        VBox vbox2 = new VBox(10);
        vbox2.getChildren().addAll(apollo13);

        ZooAnimal elephant = new ZooAnimal("Elephant");
        ZooAnimal lion = new ZooAnimal("Lion");
        ZooAnimal giraffe = new ZooAnimal("Giraffe");
        happyZoo = new ChoiceBox<ZooAnimal>();
        happyZoo.getItems().addAll(elephant, lion, giraffe);
        happyZoo.setValue(lion);
        happyZoo.setOnAction(e -> animal_click());
        VBox vbox3 = new VBox(10);
        vbox3.getChildren().addAll(happyZoo);

        HBox mainPane = new HBox(10, vbox, vbox2, vbox3);

        Scene scene = new Scene(mainPane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ChoiceBoxes");
        primaryStage.show();

    }

    private void dwarf_Click() {
        String message = "Your Favourite Dwarf is ";
        message += choice.getValue() + ".";
        Alert a = new Alert(Alert.AlertType.INFORMATION, message);
        a.showAndWait();
    }

    private void astronaut_click() {
        String message = "The astronaut that got sucked into a black hole is ";
        message += apollo13.getValue() + ".";
        Alert a = new Alert(Alert.AlertType.INFORMATION, message);
        a.showAndWait();
    }

    private void animal_click() {
        String message = "We're at the zoo and we just saw a/an  ";
        message += happyZoo.getValue() + ".";
        Alert a = new Alert(Alert.AlertType.INFORMATION, message);
        a.showAndWait();
    }
}

class Astronaut {

    public String firstName;
    public String lastName;

    public Astronaut(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

class ZooAnimal {

    public String animal;

    public ZooAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return animal;
    }
}
