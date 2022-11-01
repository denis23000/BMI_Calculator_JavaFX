module com.example.javafxdemo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxdemo3 to javafx.fxml;
    exports com.example.javafxdemo3;
}