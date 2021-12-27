package tryCatch;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class tryCatchClass {
    public static void main(String[] args) {


    }
    public static void erMethod() throws MidiUnavailableException {

        Sequencer player = MidiSystem.getSequencer();
        Sequence seq = new Sequence(timing, 4);
    }
}
