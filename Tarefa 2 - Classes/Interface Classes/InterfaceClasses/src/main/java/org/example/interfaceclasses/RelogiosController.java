package org.example.interfaceclasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Objects;

public class RelogiosController {

    @FXML
    private Button back;

    @FXML
    private Button btnajuste;

    @FXML
    private Button btnhora;

    @FXML
    private Button btnsair;

    @FXML
    private Label label1;


    @FXML
    private AnchorPane pageRelogios;
    Relogios relogios = new Relogios();

    @FXML
    void actajuste(ActionEvent event) {
        label1.setText(relogios.ajustarHora());
        label1.setVisible(true);

    }

    @FXML
    void actcsair(ActionEvent event) {
        Stage stage = (Stage) pageRelogios.getScene().getWindow();
        stage.close();

    }

    @FXML
    void acthora(ActionEvent event) {
        label1.setText(relogios.verificarHora());
        label1.setVisible(true);
    }

    @FXML
    void backhome(ActionEvent event) {
        Stage stage = (Stage) pageRelogios.getScene().getWindow();
        stage.close();

    }
    @FXML
    public void initialize() {
        String css = Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm();
        pageRelogios.getStylesheets().add(css);
    }

}
