
import javax.swing.*;

public class Test extends JFrame {
    JButton b1,b2,b3,b4,b5;
    public Test(){
    
    setSize(500,700);
    setTitle("Demo");
    b1=new JButton("Button1");
    b2=new JButton("Button2");
    b3=new JButton("Button3");
    b5=new JButton("5");
    b4=new JButton("Long named Button4");

    b1.setBounds(200,100,100,50);
    b2.setBounds(200,200,100,50);
    b3.setBounds(200,300,100,50);
    b4.setBounds(100,400,300,50);
    b5.setBounds(200,500,100,50);

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    setLayout(null);
    setVisible(true);
    




}
public static void main(String[] args){
    new Test();
}

    
}
