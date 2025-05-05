/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxmlapplication;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 *
 * @author jitendra
 */
public class MainController implements Initializable {


    @FXML
    private VBox slidingBox;

    private boolean isVisible = false;

    @FXML
    private void handleButtonAction(){
        TranslateTransition transition = new TranslateTransition(Duration.seconds(1.0), slidingBox);

        if(isVisible){
            transition.setToX(400);
            slidingBox.setVisible(false);
        }
        else{
            transition.setToX(0);
            slidingBox.setVisible(true);
            slidingBox.toFront();
        }
        transition.play();
        isVisible = !isVisible;
        System.out.println(isVisible);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
