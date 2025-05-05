package javafxmlapplication;

import javafx.scene.control.Alert;
import org.json.JSONObject;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

class connection{
    public static void sendData(String name, String password, String conformPassword, String email) throws IOException {

        URL url = new URL("http://localhost:5000/api/send_data");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        String s = "Content-Type";
        String a = "application/json";
        conn.setRequestProperty(s,a);
        conn.setDoOutput(true);
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("pass", password);
        json.put("conpass", conformPassword);
        json.put("email", email);
        String data = json.toString();
        OutputStream os = null;
        try{
            os = conn.getOutputStream();
            os.write(data.getBytes(StandardCharsets.UTF_8));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while((line = in.readLine())!=null){
            response.append(line);
        }
        in.close();

        //System.out.println("Response: " + response.toString());
        showPopUp("information","Info","Sucess",response.toString());
    }

    private static void showPopUp(String Alert_type, String Title, String Header, String Content){
        Playbeep();
        Alert_type = Alert_type.toUpperCase();
        Alert alert = new Alert(Alert.AlertType.valueOf(Alert_type));
        alert.setTitle(Title);
        alert.setHeaderText(Header);
        alert.setContentText(Content);
        alert.showAndWait();
    }

    private static void Playbeep(){
        try{
            Toolkit.getDefaultToolkit().beep();
        }
        catch (Exception e){

        }
    }

    public static void main(String[] args) throws IOException {
        sendData("Jhon","123","123","jhon@gmail.com");
    }
}