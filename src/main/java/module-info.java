module ru.invegorant.heartapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.invegorant.heartapp to javafx.fxml;
    exports ru.invegorant.heartapp;
}