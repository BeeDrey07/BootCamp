module com.example.javadummiesbook6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.javadummiesbook6 to javafx.fxml;
//    exports com.example.javadummiesbook6;
    exports com.example.javadummiesbook6.Chapter1;
    exports com.example.javadummiesbook6.Chapter2;
    opens com.example.javadummiesbook6.Chapter1 to javafx.fxml;
    opens com.example.javadummiesbook6.Chapter2 to javafx.fxml;
    exports com.example.javadummiesbook6.Chapter3;
    opens com.example.javadummiesbook6.Chapter3 to javafx.fxml;
    exports com.example.javadummiesbook6.Chapter4;
    opens com.example.javadummiesbook6.Chapter4 to javafx.fxml;
    exports com.example.javadummiesbook6.Chapter5;
    opens com.example.javadummiesbook6.Chapter5 to javafx.fxml;
    exports com.example.javadummiesbook6.Chapter6;
    opens com.example.javadummiesbook6.Chapter6 to javafx.fxml;
}