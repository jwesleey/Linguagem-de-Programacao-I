package org.example.interfaceclasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CaesController {


    @FXML
    private Button back;

    @FXML
    private Button btnbrincar;

    @FXML
    private Button btndeitar;

    @FXML
    private Button btnlatir;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private AnchorPane pageCaes;
    Caes caes = new Caes();

    @FXML
    void actbrincar(ActionEvent event) {
        label3.setText(caes.brincar());
        label3.setVisible(true);
    }

    @FXML
    void actdeitar(ActionEvent event) {
        label2.setText(caes.deitar());
        label2.setVisible(true);
    }

    @FXML
    void actlatir(ActionEvent event) {
        label1.setText(caes.latir());
        label1.setVisible(true);
    }

    @FXML
    void backhome(ActionEvent event) {
        Stage stage = (Stage) pageCaes.getScene().getWindow();
        stage.close();

    }

}


