package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;



public class Main extends Application {
    static GranularModel Grandad = new GranularModel();

    @Override
    public void start(Stage primaryStage) throws Exception{



        sample.Controller GSPController = new sample.Controller(Grandad);
        sample.View view = new sample.View(Grandad, GSPController);
        primaryStage.setTitle("Grandaddy");
        primaryStage.setScene(new Scene(view.asParent(), 800, 400));
        Controller.setView(view);
        primaryStage.show();

        SoundPlayer soundPlayer = new SoundPlayer();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
