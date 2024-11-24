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

public class CaesController {

    @FXML
    private Button back;

    @FXML
    private Button btnbrincar;

    @FXML
    private Button btndeitar;

    @FXML
    private Button btnlatir;

    @FXML
    private AnchorPane pageCaes;

    @FXML
    private MediaView mediaplayer;


    @FXML
    void actbrincar(ActionEvent event) {
        startvideo("/org/example/interfaceclasses/midia/playing.mp4");
    }

    @FXML
    void actdeitar(ActionEvent event) {
        startvideo("/org/example/interfaceclasses/midia/sleeping.mp4");
    }

    @FXML
    void actlatir(ActionEvent event) {
        startvideo("/org/example/interfaceclasses/midia/woof.mp4");
    }

    @FXML
    void backhome(ActionEvent event) {
        Stage stage = (Stage) pageCaes.getScene().getWindow();
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
        pageCaes.getStylesheets().add(css);
    }
}


