package org.example.interfaceclasses.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.interfaceclasses.Classes.Guitarras;

import java.util.Objects;

public class GuitarrasController {

    @FXML
    private Button back;

    @FXML
    private Button btnafinar;

    @FXML
    private Button btnnota;

    @FXML
    private Button btntocar;

    @FXML
    private Label label1;

    @FXML
    private AnchorPane pageGuitarras;

    Guitarras guitarras = new Guitarras();

    @FXML
    void actafinar(ActionEvent event) {
        label1.setText(guitarras.afinar());
        label1.setVisible(true);

    }

    @FXML
    void actnota(ActionEvent event) {
        label1.setText(guitarras.verificarNota());
        label1.setVisible(true);

    }

    @FXML
    void acttocar(ActionEvent event) {
        label1.setText(guitarras.tocar());
        label1.setVisible(true);

    }

    @FXML
    void backhome(ActionEvent event) {
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();

    }
    @FXML
    public void initialize() {
        String css = Objects.requireNonNull(getClass().getResource("/org/example/interfaceclasses/styles.css")).toExternalForm();
        pageGuitarras.getStylesheets().add(css);
    }
}
