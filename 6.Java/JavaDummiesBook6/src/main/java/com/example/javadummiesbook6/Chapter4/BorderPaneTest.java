package com.example.javadummiesbook6.Chapter4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BorderPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button one");
        Button btn2 = new Button("Button two");
        Button btn3 = new Button("Button three");
        Button btn4 = new Button("Button four");
        Button btn5 = new Button("Button five");
        Button btn6 = new Button("Button six");
        Button btn7 = new Button("Button seven");
        Button btn8 = new Button("Button eight");
        Button btn9 = new Button("Button nine");
        Button btn10 = new Button("Button ten");

        VBox vbox1 = new VBox(btn1, btn2);
        VBox vbox2 = new VBox(btn3, btn4);
        VBox vbox3 = new VBox(btn5, btn6);
        VBox vbox4 = new VBox(btn7, btn8 );
        VBox vbox5 = new VBox(btn9, btn10);

        BorderPane bpane = new BorderPane(vbox1, vbox2, vbox3, vbox4, vbox5);
        vbox1.setAlignment(Pos.CENTER);
        vbox2.setAlignment(Pos.CENTER);
        vbox3.setAlignment(Pos.CENTER);
        vbox4.setAlignment(Pos.CENTER);
        vbox5.setAlignment(Pos.CENTER);

        Scene scene = new Scene(bpane, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Testing Border Pane");
        primaryStage.show();

    }
}
