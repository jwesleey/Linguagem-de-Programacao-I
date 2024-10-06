package org.example.interfaceclasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.net.URL;


public class CelularesController {

    @FXML
    private Button back;

    @FXML
    private Button btninstagram;

    @FXML
    private Button btnparear;

    @FXML
    private Button call;

    @FXML
    private MediaView mediaplayer;

    @FXML
    private AnchorPane pageCel;

    @FXML
    void actcall(ActionEvent event) {
        startvideo(call);

    }

    @FXML
    void actinstagram(ActionEvent event) {
        startvideo(btninstagram);

    }

    @FXML
    void actparear(ActionEvent event) {
        startvideo(btnparear);

    }

    @FXML
    void backhome(ActionEvent event) {
        Stage stage = (Stage) pageCel.getScene().getWindow();
        stage.close();

    }

    private MediaPlayer mediaPlayer;

    @FXML
    void startvideo(Button button) {
        URL caminho = null;

        if (button == call) {
            caminho = getClass().getResource("/org/example/interfaceclasses/midia/call911.mp4");
        } else if (button == btninstagram) {
            caminho = getClass().getResource("/org/example/interfaceclasses/midia/AcessInstagram.mp4");
        } else if (button == btnparear) {
            caminho = getClass().getResource("/org/example/interfaceclasses/midia/Parear.mp4");
        }

        if (caminho != null) {
            System.out.println("Caminho do vídeo: " + caminho);
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
            System.out.println("Não encontrado.");
        }
    }
}
