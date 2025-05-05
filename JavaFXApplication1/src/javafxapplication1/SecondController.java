package javafxapplication1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;

public class SecondController {
    @FXML
    Button btn;


    public void handleAction(javafx.event.ActionEvent actionEvent) {
        System.out.println("Button is clicked");
    }
}
