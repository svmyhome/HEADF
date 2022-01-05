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
//        Sequence seq = new Sequence(timing, 4);
//        String = "22e4984a-55bb-458f-a51b-2a1a7b8f1efc";
    }
}
