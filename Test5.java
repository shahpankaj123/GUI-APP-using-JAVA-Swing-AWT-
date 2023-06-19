import javax.swing.*;

public class Test5 extends JFrame {

    JLabel l;
     public Test5(){
        l= new JLabel();
        setSize(400,400);
         
        l.setBounds(150, 150,160, 60);

        add(l);

        setLayout(null);
        setVisible(true);
        
        //JOptionPane.showMessageDialog(this, "hello");
        int choice=JOptionPane.showConfirmDialog(this, "hello");

        if(choice == JOptionPane.YES_OPTION){
            l.setText("Yes Key Pressed");
        }
        if(choice == JOptionPane.CANCEL_OPTION){
             l.setText("Cancel Key Pressed");
        }
        if(choice == JOptionPane.YES_NO_CANCEL_OPTION){
            l.setText("No Key Pressed");
        }

     }

     public static void main(String[] args){
        new Test5();
     }
    
}
