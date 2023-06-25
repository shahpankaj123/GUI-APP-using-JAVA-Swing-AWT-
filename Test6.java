import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Test6 implements MouseListener,MouseMotionListener {
    JFrame f;
    JTextField t1,t2;
    public Test6(){
        f=new JFrame();
        f.setSize(400, 400);
        t1= new JTextField();
        t2=new JTextField();

        f.add(t1);
        f.add(t2);

        f.setLayout(new FlowLayout());
        f.setVisible(true);

        f.addMouseListener(this);
        f.addMouseMotionListener(this);
    }
    
    public void MouseEntered(MouseEvent e){
        t1.setText("IN");
    }
    public void MouseExited(MouseEvent e){
        t1.setText("OUT");
    }
    public void MouseMoved(MouseEvent e){
        String c= "x:"+e.getX()+"Y:"+e.getY();
        t2.setText(c);
    }
    public void MousePressed(MouseEvent e){}
    public void MouseReleased(MouseEvent e){}
    public void MouseClicked(MouseEvent e){}
    public void MouseDragged(MouseEvent e){}

    public static void main(String[] args){
        new Test6();}
    }
    

