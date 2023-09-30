package practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MusicPlayer_Frame extends JFrame implements ActionListener{
	int song_num;
	int num_of_songs;
	JButton next;
	JButton back;
	boolean change;
	MusicPlayer_Frame(int x){
		this.song_num = 0;
		this.num_of_songs = x;
		this.change=false;
		
		next = new JButton();
		next.addActionListener(this);
		next.setBounds(605, 250-75/2, 75, 75);
		next.setText(">");
		next.setFocusable(false);
		next.setFont(new Font("Georgia",Font.BOLD,40));
		next.setForeground(Color.green);
		next.setBackground(Color.black);
		next.setBorder(BorderFactory.createLineBorder(Color.green));
		
		back = new JButton();
		back.addActionListener(this);
		back.setBounds(10, 250-75/2, 75, 75);
		back.setText("<");
		back.setFocusable(false);
		back.setFont(new Font("Georgia",Font.BOLD,40));
		back.setForeground(Color.green);
		back.setBackground(Color.black);
		back.setBorder(BorderFactory.createLineBorder(Color.green));
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,500);
		this.setLayout(null);
		this.setVisible(true);
		this.getContentPane().setBackground(new Color(20,20,20));
		this.setResizable(false);
		this.add(back);
		this.add(next);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==next) {
			if(this.song_num==this.num_of_songs-1) {
				this.song_num=0;
			}
			else if(this.song_num<this.num_of_songs-1) {
				this.song_num++;
				this.change=true;
			}
		}
		if(e.getSource()==back) {
			if(this.song_num==0) {
				this.song_num=this.num_of_songs-1;
			}
			else if(this.song_num>0) {
				this.song_num--;
				this.change=true;			
			}
		}
	}
}
