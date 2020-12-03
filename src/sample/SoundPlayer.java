package sample;

import net.beadsproject.beads.core.AudioContext;
import net.beadsproject.beads.data.Sample;
import net.beadsproject.beads.ugens.GranularSamplePlayer;
import net.beadsproject.beads.ugens.SamplePlayer;
import net.beadsproject.beads.ugens.Static;

public class SoundPlayer {


    SoundPlayer() {
        //SYNTH
        AudioContext ac = new AudioContext();

        // load the source sample from a file
        Sample sourceSample = null;
        boolean sampleReady = false;
        try {
            sourceSample = new Sample("alarm05.wav");
            sampleReady = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }

        // instantiate a GranularSamplePlayer
        GranularSamplePlayer gsp = new GranularSamplePlayer(ac, sourceSample);

        // set loop?
        gsp.setLoopType(SamplePlayer.LoopType.LOOP_FORWARDS);

        // connect gsp to ac
        ac.out.addInput(gsp);
        //gsp.setPitch(new Static(ac, );

        // instantiate synth and midikeyboard
        Synth synth = new Synth();
        MidiKeyboard midiKeyboard = new MidiKeyboard(synth);

        ac.start();
        // while-loop to configure modifiers live
       /* while(true){
            System.out.println("hej");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

    }
}
