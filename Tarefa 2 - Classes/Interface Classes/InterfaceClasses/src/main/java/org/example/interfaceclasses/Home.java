package org.example.interfaceclasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Home {

    @FXML
    private Button Carros;

    @FXML
    private Button alunos;

    @FXML
    private Button caes;

    @FXML
    private Button celulares;

    @FXML
    private Button guitar;

    @FXML
    private Button menu;

    @FXML
    private Button pessoas;

    @FXML
    private Button portas;

    @FXML
    private Button relogio;

    @FXML
    private Button roupas;

    @FXML
    void AcessCarros(ActionEvent event) throws IOException {
        loadScene("Carros.fxml", "Carros");
    }

    @FXML
    void AcessCel(ActionEvent event) throws IOException {
        loadScene("Celulares.fxml", "Celulares");
    }

    @FXML
    void AcessGuitar(ActionEvent event) throws IOException {
        loadScene("Guitars.fxml", "Guitars");
    }

    @FXML
    void AcessMenu(ActionEvent event) throws IOException {
        loadScene("Menu.fxml", "Menu");
    }

    @FXML
    void AcessPessoas(ActionEvent event) throws IOException {
        loadScene("Pessoas.fxml", "Pessoas");
    }

    @FXML
    void AcessPortas(ActionEvent event) throws IOException {
        loadScene("Portas.fxml", "Portas");
    }

    @FXML
    void AcessRelogio(ActionEvent event) throws IOException {
        loadScene("Relogios.fxml", "Relógios");
    }

    @FXML
    void acessAlunos(ActionEvent event) throws IOException {
        loadScene("Alunos.fxml", "Alunos");
    }

    @FXML
    void acessCaes(ActionEvent event) throws IOException {
        loadScene("Caes.fxml", "Cães");
    }

    @FXML
    void acessRoupas(ActionEvent event) throws IOException {
        loadScene("Roupas.fxml", "Roupas");
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
