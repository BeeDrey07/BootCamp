package com.example.javadummiesbook6.Chapter6;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TreeViewTest extends Application {

    TreeView tree;

    Label lblShowName;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TreeItem andy, archie, happy, maude, george;
        TreeItem root = new TreeItem<>("The spin offs");
        root.setExpanded(true);

        andy = makeShow("The Andy Griffith show", root);
        makeShow("Gomer Pyle, U.S.M.C.", andy);
        makeShow("Mayberry R.F.D.", andy);

        archie = makeShow("All in the Family", root);
        george = makeShow("The Jeffersons", archie);
        makeShow("Checking In", george);

        maude = makeShow("Maude", archie);
        makeShow("Good Times", maude);
        makeShow("Gloria", archie);
        makeShow("Archie Bunker's Place", archie);

        happy = makeShow("Happy Days", root);
        makeShow("Mork and Mindy", happy);
        makeShow("Laverne and Shirley", happy);
        makeShow("Joanie Loves Chachi", happy);
        tree = new TreeView(root);
        tree.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tree.setShowRoot(false);
        tree.setOnMouseClicked(e -> tree_clicked());
//        tree.getSelectionModel().selectedItemProperty()
//                .addListener( (v, oldValue, newValue) ->
//                        tree_SelectionChanged(newValue) );

        lblShowName = new Label();

//        TreeView tree = new TreeView<>(root);

        VBox vbox = new VBox(tree);
        Scene scene = new Scene(vbox, 500, 500);
        primaryStage.setTitle("Spin Offs");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public TreeItem<String> makeShow(String title, TreeItem<String> parent) {
        TreeItem<String> show = new TreeItem<>(title);
        show.setExpanded(true);
        parent.getChildren().add(show);
        return show;
    }

        public void tree_clicked() {
        String msg = "";
        ObservableList<TreeItem> shows = tree.getSelectionModel().getSelectedItems();
        for (TreeItem show : shows) {
            msg += show.getValue() + "\n";
        }
        System.out.println("You selected these shows: \n" + msg);
    }
//    public void tree_SelectionChanged(TreeItem<String> item)
//
//    {
//        if (item != null) {
//            lblShowName.setText(item.getValue());
//        }
//    }
}