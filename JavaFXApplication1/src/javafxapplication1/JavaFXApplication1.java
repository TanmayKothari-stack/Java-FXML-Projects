/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Border;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 * @author jitendra
 */
public class JavaFXApplication1 extends Application {

    private static boolean isLoggedIn = false;
    
    @Override
    public void start(Stage stage) throws IOException {
        Parent root;
        if(!isLoggedIn)
        {
            root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        }
        else {
            root = FXMLLoader.load(getClass().getResource("second_screen.fxml"));
        }
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Login Form");
            stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }


}
