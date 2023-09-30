package practice;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class code implements ActionListener
{
    int c=0;
    String code;
    String coded=" ";
    String[] decoded = new String[301];
    String[] encoded = new String[301];
    //create Frame 
    Frame f = new Frame();
    //create textfeild
    TextField encode = new TextField();
    TextField decode = new TextField();
    //create button
    Button enter1 = new Button("Enter");
    Button enter2 = new Button("Enter");
    //construtor
    public code()
    {
        //set bounds for text field 
        encode.setBounds(200,100,100,20);
        decode.setBounds(200,140,100,20);
        //set bounds for buttons 
        enter1.setBounds(50,220,50,20);
        enter2.setBounds(110,220,50,20);
        //adding labels textfeild and buttons to the frame 
        f.add(encode); f.add(decode); 
        f.add(enter1); f.add(enter2); 
        //add action listener to buttons 
        enter1.addActionListener(this);
        enter2.addActionListener(this);
       
        //set the size of frame 
        f.setLayout(null);
        f.setSize(450,350);
        f.setVisible(true);
    }
    public static void main(String[]args)
    {
        new code(); 
    }
    public static String encode(int a)
    {
        char[]code={'1','2','3','4','5','6','7','8','9','a','b',
            'c','d','e','f','g','h','i','j','k','l','m','n','o','p',
            'q','r','s','t','u','v','w','x','y','z'};
        String ans="";
        for (int i=0;i<=a;i++)
        {
            ans.replace(ans.charAt(i),code[(int)(Math.random()*code.length+1)]);
        }
        return ans;
        }
    public void actionPerformed(ActionEvent e)
    {
        code = encode.getText();
        coded = decode.getText();
        int n=1;
        if (e.getSource()==enter1)
        {
              for (int i=0;i<=300;i++)
            {
                if (encode.equals(decoded[i]))
                {
                     decode.setText(encoded[i]);
                     break;
                }
                if (i==300)
                {
                    n=2;
                }
             } 
            if (n==2)
            {
                decoded[c]=code;
                int w=code.length();
                coded=encode(w);
                decode.setText(coded);
                c++;
            }
        }
    }
}