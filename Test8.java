import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.*;



public class Test8 implements ActionListener{
    JFrame f1,f2;
    JButton b1;
    JButton b;
    JLabel l;
    public Test8(){
        b1=new JButton("POPUP");
        f1= new JFrame();
        f1.setSize(400, 400);
        f1.add(b1);
        b1.addActionListener(this);
        f1.setLayout(new FlowLayout(FlowLayout.CENTER));
        f1.setVisible(true);

    }
    public void Popup(){
        l=new JLabel("Message Popup !!");
        b=new JButton("Ok");
        f2= new JFrame("Message");
        f2.setSize(300, 150);
        f2.setResizable(false);
        l.setAlignmentX(Component.CENTER_ALIGNMENT);
        b.setAlignmentX(Component.CENTER_ALIGNMENT);
        f2.add(Box.createVerticalStrut(25));
        f2.add(l);
        f2.add(Box.createVerticalStrut(15));
        f2.add(b);
        f2.setLayout(new BoxLayout(f2.getContentPane(), BoxLayout.Y_AXIS));
        f2.setVisible(true);
        b.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            this.Popup();
        }
        else{
           f2.dispose();
        }
       

    }
    public static void main(String[] args){
        new Test8();
    }
    
}
