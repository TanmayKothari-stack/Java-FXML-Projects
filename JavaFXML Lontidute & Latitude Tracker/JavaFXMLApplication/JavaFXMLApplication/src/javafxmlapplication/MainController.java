/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafxmlapplication;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author jitendra
 */
public class MainController implements Initializable {

    @FXML
    private Label label;
    private String apiURL = "http://ip-api.com/json";

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        URL url = new URL(apiURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while((line = reader.readLine())!=null){
            response.append(line);
        }
        reader.close();

        JSONObject json = new JSONObject(response.toString());
        double latitude  = json.getDouble("lat");
        double longitude  = json.getDouble("lon");


        System.out.println("Latitude: " + latitude);
        System.out.println("Lontitude: " + longitude);
        //label.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
