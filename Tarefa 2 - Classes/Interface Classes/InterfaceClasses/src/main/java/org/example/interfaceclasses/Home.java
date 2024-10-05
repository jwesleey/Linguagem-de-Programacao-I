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

    FXMLLoader fxmlLoader = new FXMLLoader();

    @FXML
    void AcessCarros(ActionEvent event) throws IOException {
        fxmlLoader = new FXMLLoader(getClass().getResource("Carros.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Carros");
        stage.show();


    }

    @FXML
    void AcessCel(ActionEvent event) throws IOException {
        fxmlLoader = new FXMLLoader(getClass().getResource("Celulares.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Celulares");
        stage.show();

    }

    @FXML
    void AcessGuitar(ActionEvent event) {

    }

    @FXML
    void AcessMenu(ActionEvent event) {

    }

    @FXML
    void AcessPessoas(ActionEvent event) {

    }

    @FXML
    void AcessPortas(ActionEvent event) {

    }

    @FXML
    void AcessRelogio(ActionEvent event) throws IOException {
        fxmlLoader = new FXMLLoader(ExecuteApplication.class.getResource("Relogios.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Relógios");
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    void acessAlunos(ActionEvent event) throws IOException {
        fxmlLoader = new FXMLLoader(ExecuteApplication.class.getResource("Alunos.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Alunos");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void acessCaes(ActionEvent event) throws IOException {
        fxmlLoader = new FXMLLoader(ExecuteApplication.class.getResource("Caes.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Cães");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void acessRoupas(ActionEvent event) throws IOException {
        fxmlLoader = new FXMLLoader(ExecuteApplication.class.getResource("Roupas.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Roupas");
        stage.setScene(scene);
        stage.show();


    }

}
