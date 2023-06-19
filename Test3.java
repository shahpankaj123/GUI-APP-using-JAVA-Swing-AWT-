import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.awt.*;


public class Test3 extends JFrame implements ActionListener{
    JLabel l;
    JTextField t;
    JButton b;
    int attempts,randomNumber;

    public Test3(){
        setSize(400, 400);
        t=new JTextField();
        t.setColumns(10);
        l=new JLabel();
        generateNumber();
        b= new JButton("Try");
        add(t);
        add(l);
        add(b);
        setLayout(new FlowLayout());
        setVisible(true);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int num=Integer.parseInt(t.getText());
        attempts++;
        System.out.println(randomNumber);
        if(num==randomNumber){
            JOptionPane.showMessageDialog(this,"congrats! you got right one in Attempts:"+attempts);
            generateNumber();
        }
        else{
            JOptionPane.showMessageDialog(this,"Opps! wrong choice","Error",JOptionPane.ERROR_MESSAGE);
            l.setText("Attempt:"+attempts);

        }

    }
    public void generateNumber(){
        attempts=0;
        l.setText("Attempts:"+attempts);
        Random r=new Random();
        randomNumber=r.nextInt(10);
    }
    public static void main(String[] args){
        new Test3();
    }

    
}
