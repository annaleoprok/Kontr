package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;



public class Controller {

    @FXML
    private Button Enter;

    @FXML
    private TextField Login;

    @FXML
    private TextField Pass;

    @FXML
    private Label Who;


    public void LogPass(ActionEvent event) {
        if (Login.getText().toString().equals("admin1")&& Pass.getText().toString().equals("pass")) {
            Who.setText("Привет админ!");
            Who.setTextFill(Color.GREEN);
        }
        else{
            Who.setText("Ошибка");
            Who.setTextFill(Color.RED);
        }
    }
}


