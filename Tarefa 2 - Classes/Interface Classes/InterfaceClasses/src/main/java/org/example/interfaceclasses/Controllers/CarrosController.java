package org.example.interfaceclasses.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.example.interfaceclasses.Classes.Carros;

import java.util.Objects;

public class CarrosController {

    @FXML
    private Button back;

    @FXML
    private Button btnacelerar;

    @FXML
    private Button btnbuzinar;

    @FXML
    private Button btnreduzir;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private AnchorPane pageCars;

    Carros carros = new Carros();

    @FXML
    void actacelerar(ActionEvent event) {
        label1.setText(carros.acelerar());
        label1.setVisible(true);


    }

    @FXML
    void actbuzinar(ActionEvent event) {
        label3.setText(carros.buzinar());
        label3.setVisible(true);

    }

    @FXML
    void actreduzir(ActionEvent event) {
        label2.setText(carros.reduzir());
        label2.setVisible(true);

    }

    @FXML
    void backhome(ActionEvent event) {
        Stage stage = (Stage) pageCars.getScene().getWindow();
        stage.close();

    }
    @FXML
    public void initialize() {
        String css = Objects.requireNonNull(getClass().getResource("/org/example/interfaceclasses/styles.css")).toExternalForm();
        pageCars.getStylesheets().add(css);
    }

}
