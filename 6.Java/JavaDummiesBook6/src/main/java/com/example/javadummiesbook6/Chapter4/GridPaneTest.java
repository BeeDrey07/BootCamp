package com.example.javadummiesbook6.Chapter4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button btn1 = new Button("Button one");
        Button btn2 = new Button("Button two");
        Button btn3 = new Button("Button three");

        TextField txt1 = new TextField("TextField 1");
        TextField txt2 = new TextField("TextField 2");
        TextField txt3 = new TextField("TextField 3");

        Label lbl1 = new Label("Name");
        Label lbl2 = new Label("Name");
        Label lbl3 = new Label("Name");

        btn1.setMaxWidth(Double.MAX_VALUE);
        btn2.setMaxWidth(Double.MAX_VALUE);
        btn3.setMaxWidth(Double.MAX_VALUE);

        GridPane grid = new GridPane();

        ColumnConstraints col1 = new ColumnConstraints(200);
        ColumnConstraints col2= new ColumnConstraints(200);
        ColumnConstraints col3 = new ColumnConstraints(200);
        ColumnConstraints col4 = new ColumnConstraints(200);

        col1.setPercentWidth(33);
        col2.setPercentWidth(33);
        col3.setPercentWidth(33);

        grid.getColumnConstraints().addAll(col1, col2, col3);
        grid.addRow(0, txt1, txt2, txt3);
//        grid.setColumnSpan(txtName, 2);
//        grid.setValignment(lblName, VPos.BOTTOM);

        Scene scene = new Scene(grid, 750, 500);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Grid Pane Test");
        primaryStage.show();
    }
}
