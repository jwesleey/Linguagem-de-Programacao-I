package org.jw.e2_classesbd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Execute extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Execute.class.getResource("/org/jw/e2_classesbd/Home.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bem-Vindo!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}