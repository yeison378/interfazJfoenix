package com.example.interfaz;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    private ImageView ib_Home;

    @FXML
    private ImageView ib_Settings;

    @FXML
    private ImageView ib_Shutdown;

    @FXML
    private ImageView ib_User;

    @FXML
    void mambeche(MouseEvent e) {
        if(e.getTarget()==ib_Shutdown)
            System.exit(0);
        else
        if(e.getTarget()==ib_Home)
        {
            Menu1.setVisible(false);
            Menu2.setVisible(false);
        }else
        if(e.getTarget()==ib_Settings)
        {
            Menu1.setVisible(true);
            Menu2.setVisible(false);
        }else
        if(e.getTarget()==ib_User)
        {
            Menu2.setVisible(true);
            Menu1.setVisible(false);
        }
    }
}