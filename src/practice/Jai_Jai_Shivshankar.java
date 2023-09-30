package practice;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Jai_Jai_Shivshankar extends Song{
	File song;
	AudioInputStream audioStream;
	Clip clip;
	double mode(int x) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		if(x==1) {
			song = new File("Jai Jai Shivshankar.wav");
			audioStream = AudioSystem.getAudioInputStream(song);
			clip = AudioSystem.getClip();
			clip.open(audioStream);
		}
		else if(x==2) {
			clip.start();
		}
		else if(x==3) {
			clip.stop();
		}
		else if(x==4) {
			clip.close();
		}
		else if(x==5) {
			clip.setMicrosecondPosition(0);
		}
		return ((double)clip.getMicrosecondPosition())/((double)clip.getMicrosecondLength());		
	}
	String name() {
		return "Jai Jai Shivshankar";
	}
	
}

