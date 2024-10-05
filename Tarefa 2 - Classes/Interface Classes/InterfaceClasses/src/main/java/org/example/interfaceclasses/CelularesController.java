package org.example.interfaceclasses;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

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

    }

    @FXML
    void actinstagram(ActionEvent event) {

    }

    @FXML
    void actparear(ActionEvent event) {


    }

    @FXML
    void backhome(ActionEvent event) {

    }

    private MediaPlayer mediaPlayer;

    @FXML
    public void initialize() {
        Path myvideo = Paths.get("org/example/interfaceclasses/midia/Parear.mp4");
        File arquivo = myvideo.toFile();
        Media media = new Media(arquivo.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaplayer.setMediaPlayer(mediaPlayer);
        mediaPlayer.play();

    }
}
