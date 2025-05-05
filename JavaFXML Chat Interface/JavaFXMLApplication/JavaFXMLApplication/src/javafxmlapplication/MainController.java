/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxmlapplication;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

/**
 *
 * @author jitendra
 */
public class MainController implements Initializable {
    
    @FXML
    private VBox messageContainer;

    @FXML
    private ScrollPane scrollPane;

    private void addMessage(String text, int index){
        HBox messageBox = new HBox();
        Label messageLabel = new Label(text);
        messageLabel.setWrapText(true);
        messageLabel.setMaxWidth(100);
        messageLabel.setMinHeight(Region.USE_PREF_SIZE);

        messageLabel.setStyle("-fx-background-color: lightblue; -fx-padding:10; -fx-background-radius: 5;");

        if(index % 2 == 0){
            messageBox.setAlignment(Pos.CENTER_RIGHT);
            messageLabel.setStyle("-fx-background-color: #dcf8c6; -fx-padding:10; -fx-background-radius: 5;");
        }
        else{
            messageLabel.setStyle("-fx-background-color: #eee; -fx-padding:10; -fx-background-radius: 5;");
        }

        messageBox.getChildren().add(messageLabel);
        messageContainer.getChildren().add(messageBox);

        scrollPane.vvalueProperty().bind(messageContainer.heightProperty());
        scrollPane.setOnMouseEntered(e -> scrollPane.requestFocus());
        if(scrollPane !=null) {
            Platform.runLater(() -> {
                scrollPane.vvalueProperty().unbind();
                scrollPane.setVvalue(1.0);
            });
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        for(int i = 0; i <= 100; i++){
            addMessage("messagehfdjkfdkfhdfkdhfdkfdhfkh " + i, i);
        }

    }

}
