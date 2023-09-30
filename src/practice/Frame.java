package practice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame implements ActionListener{
	
	JButton button;
	
	Frame(){
		ImageIcon icon = new ImageIcon("play_button.jpg");
		
		
		button = new JButton();
		button.setBounds(50,50,icon.getIconWidth(),icon.getIconHeight());
		button.setIcon(icon);
		button.addActionListener(this);
		
		this.setVisible(true);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.add(button);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("hi");
		}
		
	}
}
