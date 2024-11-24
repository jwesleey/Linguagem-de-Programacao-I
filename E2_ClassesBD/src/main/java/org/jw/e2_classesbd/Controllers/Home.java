package org.jw.e2_classesbd.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Home {

    @FXML
    private Button Aula;

    @FXML
    private AnchorPane homepage;

    @FXML
    void btnIniciar(ActionEvent event) throws IOException {
        loadScene("/org/jw/e2_classesbd/Alunos.fxml", "Iniciar Aula");
        homepage.getScene().getWindow().hide();
    }

    private void loadScene(String fxmlPage, String namePage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPage));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle(namePage);
        stage.show();
    }

    @FXML
    public void initialize() {                                                                                                                                           
        String css = Objects.requireNonNull(getClass().getResource("/org/jw/e2_classesbd/styles.css")).toExternalForm();
        homepage.getStylesheets().add(css);
    }

}
