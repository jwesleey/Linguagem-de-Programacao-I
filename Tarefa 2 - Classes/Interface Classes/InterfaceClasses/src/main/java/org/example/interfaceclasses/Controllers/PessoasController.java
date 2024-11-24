package org.example.interfaceclasses.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;

public class PessoasController {

    @FXML
    private Button back;

    @FXML
    private ImageView idgif;

    @FXML
    private Button btncomemorar;

    @FXML
    private Button btninteragir;

    @FXML
    private Button btnsorrir;

    @FXML
    private MediaView mediaplayer;

    @FXML
    private AnchorPane pagePessoas;

    @FXML
    void actcomemorar(ActionEvent event) {
        startvideo("/org/example/interfaceclasses/midia/happy.mp4");

    }

    @FXML
    void actinteragir(ActionEvent event) {
        startvideo("/org/example/interfaceclasses/midia/hi.mp4");

    }

    @FXML
    void actsorrir(ActionEvent event) {
        startvideo("/org/example/interfaceclasses/midia/smile.mp4");

    }

    @FXML
    void backhome(ActionEvent event) {
        Stage stage = (Stage) pagePessoas.getScene().getWindow();
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
        pagePessoas.getStylesheets().add(css);
    }
}
