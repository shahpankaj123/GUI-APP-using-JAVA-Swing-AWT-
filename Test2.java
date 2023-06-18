
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Test2 extends JFrame  {
    JTextField b1,b2,b3;
    JButton add,mins;
    public Test2(){
        setSize(400, 500);
        setTitle("Calculator");

        b1=new JTextField();
        b2=new JTextField();
        b3=new JTextField();


        b1.setBounds(150,50, 100,30);
        b2.setBounds(150,120, 100,30);
        b3.setBounds(150,190, 100,30);

        b3.setEditable(false);

        add=new JButton("+");
        mins=new JButton("-");

        add.setBounds(50,300,50,50);
        mins.setBounds(250,300,50,50);

        add(b1);
        add(b2);
        add(b3);
        add(add);
        add(mins);

        setLayout(null);
        setVisible(true);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int a=Integer.parseInt(b1.getText());
                int b=Integer.parseInt(b2.getText());
                int res=a+b;
                b3.setText(""+res);

        
            }
        });
        mins.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int a=Integer.parseInt(b1.getText());
                int b=Integer.parseInt(b2.getText());
                int res=a-b;
                
                b3.setText(""+res);

        
            }
        });         

    }
    public static void main(String[] args){
        new Test2();
    }

    
}
