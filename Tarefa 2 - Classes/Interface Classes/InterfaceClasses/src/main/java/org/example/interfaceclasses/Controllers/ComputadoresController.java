package org.example.interfaceclasses.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;

public class ComputadoresController {

    @FXML
    private Button back;

    @FXML
    private Button btnexecute;

    @FXML
    private Button btnoff;

    @FXML
    private Button btnon;

    @FXML
    private MediaView mediaplayer;

    @FXML
    private AnchorPane pagePC;

    @FXML
    void actexecute(ActionEvent event) {
        startvideo("/org/example/interfaceclasses/midia/meme.mp4");
    }

    @FXML
    void actoff(ActionEvent event) {
        startvideo("/org/example/interfaceclasses/midia/turnoff.mp4");
    }

    @FXML
    void acton(ActionEvent event) {
        startvideo("/org/example/interfaceclasses/midia/turnon.mp4");
    }

    @FXML
    void backhome(ActionEvent event) {
        Stage stage = (Stage) pagePC.getScene().getWindow();
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
    @FXML
    public void initialize() {
        String css = Objects.requireNonNull(getClass().getResource("/org/example/interfaceclasses/styles.css")).toExternalForm();
        pagePC.getStylesheets().add(css);
    }
}
