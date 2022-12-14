= new ShortMessage();
            msg1.setMessage(NOTE_ON, 1, 440, 100);
            MidiEvent noteOn = new MidiEvent(msg1, 1);
            track.add(noteOn);