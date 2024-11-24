package org.jw.e2_classesbd.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.jw.e2_classesbd.ConexaoBD.CRUD;

import java.io.IOException;
import java.sql.SQLException;
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
    private TextField textField;

    @FXML
    private Button btnClose;

    @FXML
    private Button btnSend;

    @FXML
    private AnchorPane pageAlunos;

    private String action;

    @FXML
    void actcaderno(ActionEvent event) throws IOException {
        loadScene("/org/jw/e2_classesbd/Book.fxml", "Caderno LP1");
        pageAlunos.getScene().getWindow().hide();
    }

    @FXML
    void actescrever(ActionEvent event) {
        action = "escrever";
        open();
    }

    @FXML
    void actperguntar(ActionEvent event) {
        action = "perguntar";
        open();
    }

    public void backhome(ActionEvent actionEvent) {
        Stage stage = (Stage) pageAlunos.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void initialize() {
        String css = Objects.requireNonNull(getClass().getResource("/org/jw/e2_classesbd/styles.css")).toExternalForm();
        pageAlunos.getStylesheets().add(css);
    }

    public void Send(ActionEvent actionEvent) {
        try {
            if (textField.getText().isEmpty()) {
                showAlert("Atenção!", "Campo vazio!", "Escreva uma anotação ou pergunta!");
                return;
            }
            if ("perguntar".equals(action)) {
                CRUD.perguntar(textField.getText());
                showAlert("Pergunta", "Pergunta registrada com sucesso!", "Pergunta salva, para acessar os registros acesse o seu caderno.");
            } else if ("escrever".equals(action)) {
                CRUD.anotar(textField.getText());
                showAlert("Anotação", "Anotação registrada com sucesso!", "Anotação salva, para acessar os registros acesse o seu caderno.");
            }
        } catch (SQLException e) {
            showAlert("Erro", "Erro ao salvar no banco", "Houve um problema ao tentar salvar a pergunta ou anotação.");
            e.printStackTrace();
        } finally {
            textField.clear();
        }

    }

    public void open() {
        textField.setVisible(true);
        btnSend.setVisible(true);
        btnClose.setVisible(true);
    }

    public void close() {
        textField.clear();
        textField.setVisible(false);
        btnSend.setVisible(false);
        btnClose.setVisible(false);
        action = null;
    }

    @FXML
    public void showAlert(String title, String header, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.show();
    }

    private void loadScene(String fxmlPage, String namePage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPage));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(namePage);
        stage.show();
    }


}
