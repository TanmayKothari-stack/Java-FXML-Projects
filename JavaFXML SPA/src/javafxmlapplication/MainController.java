/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxmlapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author jitendra
 */
public class MainController implements Initializable {
    
    @FXML
    private AnchorPane contentPane;

    @FXML
    private void mainPage(ActionEvent event) throws IOException{
        loadPage("Main.fxml");
    }

    @FXML
    private void showPage1(ActionEvent event) throws IOException {
        loadPage("Page1.fxml");
    }
    @FXML
    private void showPage2(ActionEvent event) throws IOException {
        loadPage("Page2.fxml");
    }

    private void loadPage(String fxmlFile) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Pane newPane = loader.load();
        contentPane.getChildren().setAll(newPane);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
