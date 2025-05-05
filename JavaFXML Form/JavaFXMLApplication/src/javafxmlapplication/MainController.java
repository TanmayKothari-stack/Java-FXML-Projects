/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxmlapplication;

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
    public void submitForm(ActionEvent event) {
        String uname = username.getText();
        String pass = password.getText();
        String conpass = conpassword.getText();
        String eml = email.getText();

        try {
            Connection conn = connection.getConnection();
            String sql = "insert into testtable(name, password, conpassword, email) values (?,?,?,?) ";
            try (PreparedStatement smnt = conn.prepareStatement(sql)) {
                smnt.setString(1, uname);
                smnt.setString(2, pass);
                smnt.setString(3, conpass);
                smnt.setString(4, eml);
                smnt.executeUpdate();
                showPopUp("information", "Info", "Sucess", "Data Inserted into Database");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    private void showPopUp(String Alert_type, String Title, String Header, String Content){
        Playbeep();
        Alert_type = Alert_type.toUpperCase();
        Alert alert = new Alert(Alert.AlertType.valueOf(Alert_type));
        alert.setTitle(Title);
        alert.setHeaderText(Header);
        alert.setContentText(Content);
        alert.showAndWait();
    }

    private void Playbeep(){
        try{
            Toolkit.getDefaultToolkit().beep();
        }
        catch (Exception e){

        }
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
