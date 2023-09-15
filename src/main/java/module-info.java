module com.example.core1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.core1 to javafx.fxml;
    exports com.example.core1;
}