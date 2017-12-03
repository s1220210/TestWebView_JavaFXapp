package javafxapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class ViewController implements Initializable {

    
    @FXML private WebView WebViewArea = new WebView();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        WebEngine engine = WebViewArea.getEngine();
        engine.load("https://www.google.co.jp/");    
    }    
    
    @FXML protected void onGoogle(ActionEvent event) {
        WebEngine engine = WebViewArea.getEngine();
        engine.load("https://www.google.co.jp/");
    }

    @FXML protected void onYahoo(ActionEvent event) {
        WebEngine engine = WebViewArea.getEngine();
        engine.load("http://www.yahoo.co.jp/");
    }

}
