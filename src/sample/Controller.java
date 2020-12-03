package sample;

import net.beadsproject.beads.core.AudioContext;
import net.beadsproject.beads.data.Sample;
import net.beadsproject.beads.data.audiofile.FileFormatException;
import net.beadsproject.beads.data.audiofile.OperationUnsupportedException;
import net.beadsproject.beads.ugens.GranularSamplePlayer;
import net.beadsproject.beads.ugens.SamplePlayer;

import java.io.IOException;

public class Controller {
    GranularModel model;
    View view;

    float pitch;

    public Controller (GranularModel model) {
        this.model = model;
    }

    public static void setView(View view){
        view.loadBtn.setOnAction( e-> System.out.println("HEJ"));

        view.pitchBtn.setOnAction(e-> view.pitchLbl.setText(view.pitchTextArea.getText()));
        view.grainBtn.setOnAction(e-> view.grainLbl.setText(view.grainTextArea.getText()));
        //view.grainBtn.setOnAction(e-> ));

    }




}