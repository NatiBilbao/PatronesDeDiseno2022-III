module com.example.tareas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tareas to javafx.fxml;
    exports com.example.tareas;
}