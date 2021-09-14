module ru.invegorant.heatrapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.invegorant.heartapp to javafx.fxml;
    exports ru.invegorant.heartapp;
}