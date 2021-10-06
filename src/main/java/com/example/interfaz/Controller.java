package com.example.interfaz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private AnchorPane Menu1;

    @FXML
    private AnchorPane Menu2;

    @FXML
    private AnchorPane MenuBar;


    @FXML
    private Button close_f;

    @FXML
    private Button home_f;

    @FXML
    private Button settings_f;

    @FXML
    private Button user_f;

    @FXML
    void evento(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(close_f)){
            System.exit(0);
        }else if (obj.equals(home_f)) {
            Menu1.setVisible(false);
            Menu2.setVisible(false);
        } else if (obj.equals(settings_f)) {
            Menu1.setVisible(true);
            Menu2.setVisible(false);
        } else if (obj.equals(user_f)) {
            Menu2.setVisible(true);
            Menu1.setVisible(false);
        }
    }


}