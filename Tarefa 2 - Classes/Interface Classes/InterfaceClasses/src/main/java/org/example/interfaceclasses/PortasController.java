package org.example.interfaceclasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.net.URL;

public class PortasController {

    @FXML
    private Button back;

    @FXML
    private Button btnabrir;

    @FXML
    private Button btnfechar;

    @FXML
    private Button btntrancar;

    @FXML
    private Label label3;

    @FXML
    private MediaView mediaplayer;

    @FXML
    private AnchorPane pageDoors;

    @FXML
    void actabrir(ActionEvent event) {
        startvideo("/C:/Users/jwesl/Documents/FATEC/Linguagem%20de%20Programacao%20I/Tarefa%202%20-%20Classes/Interface%20Classes/InterfaceClasses/target/classes/org/example/interfaceclasses/midia/open.mp4");

    }

    @FXML
    void actfechar(ActionEvent event) {
        startvideo("org/example/interfaceclasses/midia/close.mp4");

    }

    @FXML
    void acttrancar(ActionEvent event) {
        startvideo("org/example/interfaceclasses/midia/lock.mp4");

    }

    @FXML
    void backhome(ActionEvent event) {
        Stage stage = (Stage) pageDoors.getScene().getWindow();
        stage.close();

    }

    private MediaPlayer mediaPlayer;

    @FXML
    private void startvideo(String myvideo) {
        URL caminho = getClass().getResource(myvideo);

        if (caminho != null) {
            System.out.println("Caminho do vídeo: " + caminho);
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            Media media = new Media(caminho.toExternalForm());
            mediaPlayer = new MediaPlayer(media);
            mediaplayer.setMediaPlayer(mediaPlayer);
            mediaplayer.setVisible(true);
            mediaPlayer.play();

            mediaPlayer.setOnEndOfMedia(() -> {
                mediaPlayer.stop();
                mediaplayer.setVisible(false);
            });

        } else {
            System.out.println("Não encontrado");
        }
    }
}

