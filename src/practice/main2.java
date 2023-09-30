package practice;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class main2 {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		ImageIcon Raabta_icon = new ImageIcon("Raabta_image.png");
		ImageIcon Jai_Jai_Shivshankar_icon = new ImageIcon("Jai_Jai_Shivshankar_image.png");
		ImageIcon Tu_Jaana_Na_icon = new ImageIcon("Tu_Jaane_Na_image.png");
		Border border = BorderFactory.createLineBorder(Color.green, 5);
		
		JLabel image = new JLabel();
		image.setBorder(border);
		image.setIcon(Raabta_icon);
		image.setBounds(100, 50, 300, 300);
		
		JLabel label2 = new JLabel();
		label2.setBackground(new Color(30,144,255));
		label2.setOpaque(true);
		label2.setBounds(85, 405, 0,15);
		
		JLabel label = new JLabel();
		label.setBackground(new Color(0,0,0));
		label.setOpaque(true);
		label.setBorder(border);
		label.setBounds(80, 400, 400,25);
		
		ArrayList<Song> songs = new ArrayList<Song>();
		Song Raabta = new Raabta();
		Song Jai_Jai_Shivshankar = new Jai_Jai_Shivshankar();
		Song Tu_Jaana_Na = new Tu_Jaane_Na();
		songs.add(Raabta);
		songs.add(Jai_Jai_Shivshankar);
		songs.add(Tu_Jaana_Na);
		
		ArrayList<ImageIcon> icons = new ArrayList<ImageIcon>();
		icons.add(Raabta_icon);
		icons.add(Jai_Jai_Shivshankar_icon);
		icons.add(Tu_Jaana_Na_icon);
		
		MusicPlayer_Frame frame = new MusicPlayer_Frame(songs.size());
		Song_Panel panel = new Song_Panel();

		panel.add(image);
		panel.add(label);
		panel.add(label2);
		frame.add(panel);
		
		for(Song el : songs) {
			el.mode(1);
		}
		System.out.println("sa");
		while(true) {
			for(Song el : songs) {
				if(el!=songs.get(frame.song_num)) {
					el.mode(5);
					el.mode(3);
				}
				if(el.mode(10)==1) {
					el.mode(5);
				}
			}
			image.setIcon(icons.get(frame.song_num));
			label2.setSize((int) (390*songs.get(frame.song_num).mode(10)), 15);
			frame.setTitle("MusicPlayer - " + songs.get(frame.song_num).name());
			frame.setIconImage(icons.get(frame.song_num).getImage());
			panel.update(frame, image, label, label2);
	
			if(panel.play==true) {
				songs.get(frame.song_num).mode(2);
			}
			else if(panel.play==false) {
				songs.get(frame.song_num).mode(3);
			}
		}

	}
}

