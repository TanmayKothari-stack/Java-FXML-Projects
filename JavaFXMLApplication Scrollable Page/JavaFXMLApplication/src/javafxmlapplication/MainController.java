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
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

/**
 *
 * @author jitendra
 */
public class MainController implements Initializable {


    @FXML
    private ScrollPane scrollPane;
    @FXML
    private StackPane textContainer;
    @FXML
    private Text textContent;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        textContent.wrappingWidthProperty().bind(scrollPane.widthProperty().subtract(45));
    }    
    
}
