package practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Song_Panel extends JPanel implements ActionListener{
	JButton play_button;
	boolean play = false;
	Song_Panel(){
		play_button = new JButton();
		play_button.addActionListener(this);
		play_button.setBounds(15, 385, 50, 50);
		play_button.setText("PLAY");
		play_button.setFocusable(false);
		play_button.setFont(new Font("Georgia",Font.PLAIN,10));
		play_button.setForeground(Color.green);
		play_button.setBackground(Color.black);
		play_button.setBorder(BorderFactory.createLineBorder(Color.green));
		
		this.setLayout(null);
		this.setBackground(Color.black);
		this.setBounds(100,0,500,500);
		this.add(play_button);
	}
	void update(JFrame frame, JLabel image, JLabel label, JLabel label2) {
		this.add(image);
		this.add(label2);
		this.add(label);
		frame.add(this);
	}
	void pause() {
		play_button.setText("PLAY");
		this.play = false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==play_button) {
			if(play_button.getText().equals("PLAY")) {
				play_button.setText("PAUSE");
				this.play = true;
			}
			else if(play_button.getText().equals("PAUSE")) {
				play_button.setText("PLAY");
				this.play = false;
			}
		}
	}
}
