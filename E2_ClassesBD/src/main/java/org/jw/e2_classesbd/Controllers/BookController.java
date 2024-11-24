package org.jw.e2_classesbd.Controllers;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.jw.e2_classesbd.ConexaoBD.CRUD;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

public class BookController {


    @FXML
    private AnchorPane PageBook;

    @FXML
    private ListView<String> listA;

    @FXML
    private ListView<String> listP;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnCheck;

    @FXML
    private Button btnCloseBook;

    private ObservableList<String> perguntas;
    private ObservableList<String> notas;

    public void initialize() throws SQLException {
        perguntas = CRUD.carregarP();
        notas = CRUD.carregarA();
        listA.getItems().setAll(notas);
        listP.getItems().setAll(perguntas);
    }

    public void edit(ActionEvent actionEvent) throws SQLException {
        String selectedPergunta = listP.getSelectionModel().getSelectedItem();
        String selectedNota = listA.getSelectionModel().getSelectedItem();

        if (selectedNota == null && selectedPergunta == null) {
            showAlert("Erro", "Nenhum Item Selecionado", "Selecione uma pergunta ou uma nota para editar.");
            return;
        }

        if (selectedPergunta != null) {
            String input = text("Editar", "Edite sua pergunta.", "Escreva a nova pergunta:");
            if (input != null && !input.trim().isEmpty()) {
                CRUD.EditP(input, selectedPergunta);
            }
        }

        if (selectedNota != null) {
            String input = text("Editar", "Edite sua anotação.", "Escreva a nova anotação:");
            if (input != null && !input.trim().isEmpty()) {
                CRUD.EditN(input, selectedNota);
            }
        }
        refresh();
    }

    public void delete(ActionEvent actionEvent) throws SQLException {
        String selectedNota = listA.getSelectionModel().getSelectedItem();
        String selectedPergunta = listP.getSelectionModel().getSelectedItem();

        if (selectedNota == null && selectedPergunta == null) {
            showAlert("Erro", "Nenhum Item Selecionado", "Selecione uma pergunta ou uma nota para excluir.");
            return;
        }

        boolean isConfirmed = confirm("Confirmação de Exclusão",
                "Deseja realmente excluir este item?",
                "Esta ação não pode ser desfeita.");

        if (isConfirmed) {
            try {

                if (selectedNota != null) {
                    CRUD.deleteA(selectedNota);
                    listA.getItems().remove(selectedNota);
                }
                if (selectedPergunta != null) {
                    CRUD.deleteP(selectedPergunta);
                    listP.getItems().remove(selectedPergunta);
                }
                showAlert("Sucesso", "Exclusão Concluída", "Informação excluída com sucesso!");
            } catch (SQLException e) {
                showAlert("Erro", "Erro na Exclusão", "Ocorreu um erro ao excluir os itens.");
                throw new RuntimeException(e);
            }
        }

        refresh();
    }

    @FXML
    public void showAlert(String title, String header, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.show();
    }

    @FXML
    public boolean confirm(String title, String header, String message) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);

        Optional<ButtonType> result = alert.showAndWait();
        return result.isPresent() && result.get() == ButtonType.OK;
    }

    @FXML
    public String text(String title, String header, String message) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle(title);
        dialog.setHeaderText(header);
        dialog.setContentText(message);
        Optional<String> result = dialog.showAndWait();
        return result.orElse(null);
    }


    public void closeBook(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) PageBook.getScene().getWindow();
        stage.close();
        loadScene("/org/jw/e2_classesbd/Alunos.fxml", "Iniciar Aula");
    }

    private void loadScene(String fxmlPage, String namePage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPage));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(namePage);
        stage.show();
    }

    public void refresh() {
        try {
            perguntas = CRUD.carregarP();
            notas = CRUD.carregarA();
            listA.getItems().setAll(notas);
            listP.getItems().setAll(perguntas);
            listA.refresh();
            listP.refresh();
        } catch (SQLException e) {
            showAlert("Erro", "Erro ao Atualizar", "Não foi possível carregar as informações.");
            e.printStackTrace();
        }
    }
}
