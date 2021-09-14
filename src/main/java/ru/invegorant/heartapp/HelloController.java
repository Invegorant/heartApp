package ru.invegorant.heartapp;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane whiteContainer;

    @FXML
    private TextArea textField;

    @FXML
    private Label mainText;

    @FXML
    private Button clickSurpriseButton;

    @FXML
    private Label loveText;

    @FXML
    private Button glowButton;

    @FXML
    void initialize() {
        clickSurpriseButton.setOnAction(event -> {
            HeartPrint heartGenerator = new HeartPrint();
            clickSurpriseButton.setVisible(false);
            mainText.setVisible(false);
            loveText.setVisible(true);
            textField.setText(heartGenerator.printHeart());
            glowButton.setVisible(true);
        });
        glowButton.setOnAction(event -> {
            Effects effect = new Effects(textField);
            effect.heartBeat();
            glowButton.setVisible(false);
        });
    }
}