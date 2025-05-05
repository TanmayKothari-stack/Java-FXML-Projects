/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxmlapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author jitendra
 */
public class MainController implements Initializable {

    @FXML
    private MenuButton menuButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Rectangle clip = new Rectangle(35, 20);
        clip.setArcWidth(25);
        clip.setArcHeight(25);
        menuButton.setClip(clip);

        Region roundedOverlay = new Region();
        roundedOverlay.setPrefSize(150, 50);
        //roundedOverlay.setStyle();
        menuButton.setGraphic(roundedOverlay);
    }
    
}
