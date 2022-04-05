module com.example.javafxmaven {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxmaven to javafx.fxml;
    exports com.example.javafxmaven;
}