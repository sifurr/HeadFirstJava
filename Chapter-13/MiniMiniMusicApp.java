import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMiniMusicApp 
{
    public static void main(String[] args) 
    {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();    
    }

    public void play()
    {
        try
        {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(NOTE_ON, 1, 440, 100);
            MidiEvent noteOn = new MidiEvent(msg1, 1);
            track.add(noteOn);
            
            ShortMessage msg2 = new ShortMessage();
            msg1.setMessage(NOTE_OFF, 1, 440, 100);
            MidiEvent noteOn = new MidiEvent(msg2, 16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
