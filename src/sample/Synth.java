package sample;
import java.util.HashMap;

public class Synth {
    int[] knobValues = new int[] {0, 0, 0, 0};

    int[] padValues = new int[] {0};


    //byte[] synthByte;
    public Synth() {
    }

    public void receiveKnobMidi(byte[] a) {
        if (a[1] > 0 && a[1] <= knobValues.length) {
            knobValues[a[1]] = a[2];
            System.out.println("Knob " + a[1] + " value is set to " + knobValues[a[1]]);
        } else {
            System.out.println("Something went wrong");
        }
    }

    public float getKnobValue(int index) {
        if (index > 0 && index <= knobValues.length) {
            return knobValues[index];
        } else {
            return 0;
        }
    }
    public void receivePadMidi(byte[] a) {
        if (a[1] > 43 && a[1] < 49) {
            System.out.println(a[1]);
            padValues[0] = a[1];
            System.out.println("Current active pad is :" + padValues[0]);
        } else {
            System.out.println("Something went wrong");
        }
    }
    public int getPadValue() {
        return padValues[0];
    }
}