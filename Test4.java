
import javax.swing.*;


import java.awt.event.*;


public class Test4 extends JFrame {

    JTextField b1,b2,b3;
    JButton add,mins;
    public Test4(){
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

        Controller c =new Controller(this);

        add.addActionListener(c);
        mins.addActionListener(c);




    }

    public static void main(String[] args){
        new Test4();
    }
    
}

class Controller implements ActionListener{
    Test4 v;
    public Controller(Test4 v){
        this.v=v;
    }
    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(v.b1.getText());
        int b=Integer.parseInt(v.b2.getText());
        int res;
       if(e.getSource()==this.v.mins){
         res=a-b;
         this.v.b3.setText(""+res);
        }
        else{
            res=a+b;
            this.v.b3.setText(""+res);

        }
    }
}
