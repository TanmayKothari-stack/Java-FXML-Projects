/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxapplication1;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author jitendra
 */
public class
FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane form;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Button loginbtn;

    @FXML
    private void handleFormClick(){
        form.requestFocus();
    }


    @FXML
    private boolean loginForm(ActionEvent login) throws IOException {
        if(username.getText().trim().isEmpty()){
            showPopup("Error","Error","Username can't empty","Please write your username");
            return false;
        }
        if(password.getText().trim().isEmpty()){
            showPopup("Error","Error","Password can't empty","Please write your password");
            return false;
        }
        else{
                showPopup("Information","Info","Sucess","Login Sucessfull");
                secondScene(login);

        return false;
    }

    }

    private void showPopup(String Alert_Type,String title, String header, String content){
        playBeep();
        Alert_Type = Alert_Type.toUpperCase();
        Alert alert = new Alert(Alert.AlertType.valueOf(Alert_Type));
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void playBeep(){
        try {
            Toolkit.getDefaultToolkit().beep();
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }

    @FXML
    protected void secondScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("second_screen.fxml"));
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Second Scene");
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

}
