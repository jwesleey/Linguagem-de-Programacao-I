package org.example.interfaceclasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Objects;

public class AlunosController {

    @FXML
    private Button back;

    @FXML
    private Button btncaderno;

    @FXML
    private Button btnescrever;

    @FXML
    private Button btnperguntar;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private AnchorPane pageAlunos;

    Alunos aluno = new Alunos();

    @FXML
    void actcaderno(ActionEvent event) {
        label3.setText(aluno.abrircaderno());
        label3.setVisible(true);
    }

    @FXML
    void actescrever(ActionEvent event) {
        label2.setText(aluno.escrever());
        label2.setVisible(true);
    }

    @FXML
    void actperguntar(ActionEvent event) {
        label1.setText(aluno.perguntar());
        label1.setVisible(true);
    }

    public void backhome(ActionEvent actionEvent) {
        Stage stage = (Stage) pageAlunos.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void initialize() {
        String css = Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm();
        pageAlunos.getStylesheets().add(css);
    }
}
