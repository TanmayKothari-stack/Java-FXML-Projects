/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxmlapplication;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Alert;
import java.awt.*;
import java.sql.*;

/**
 *
 * @author jitendra
 */
public class MainController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField conpassword;
    @FXML
    private TextField email;

    @FXML
    public void submitForm(ActionEvent event) throws IOException {
        String uname = username.getText();
        String pass = password.getText();
        String conpass = conpassword.getText();
        String eml = email.getText();
        connection.sendData(uname,pass,conpass,eml);

    }


    @FXML
    private HBox parentContainer;
    @FXML
    private void setFocus(){
        parentContainer.requestFocus();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
