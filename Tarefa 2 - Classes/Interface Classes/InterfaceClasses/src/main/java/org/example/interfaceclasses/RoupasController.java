package org.example.interfaceclasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Objects;

public class RoupasController {

    @FXML
    private Button back;

    @FXML
    private Button btncomprar;

    @FXML
    private Button btnescolher;

    @FXML
    private Button btnprovar;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private AnchorPane pageRoupas;

    Roupas roupa = new Roupas();

    @FXML
    void actcomprar(ActionEvent event) {
        label3.setText(roupa.comprar());
        label3.setVisible(true);

    }

    @FXML
    void actescolher(ActionEvent event) {
        label1.setText(roupa.escolher());
        label1.setVisible(true);

    }

    @FXML
    void actprovar(ActionEvent event) {
        label2.setText(roupa.provar());
        label2.setVisible(true);

    }

    @FXML
    void backhome(ActionEvent event) {
        Stage stage = (Stage) pageRoupas.getScene().getWindow();
        stage.close();

    }
    @FXML
    public void initialize() {
        String css = Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm();
        pageRoupas.getStylesheets().add(css);
    }
}
