import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test7 extends JFrame implements ActionListener,MouseListener {
    JPopupMenu m;
    JMenuItem t1,t2;
    JTextField t;

    public Test7(){
        setSize(400, 400);
        m= new JPopupMenu();
        add(m);


        t=new JTextField();
        t.setBounds(100, 150, 50, 50);

        t1=new JMenuItem("one");
        m.add(t1);

        t1=new JMenuItem("Two");
        m.add(t2);

        add(t);

        setLayout(null);
        setVisible(true);

        t1.addActionListener(this);
        t2.addActionListener(this);
        addMouseListener(this);



    }
    public void MouseClicked(MouseEvent e){
        m.show(this, e.getX(), e.getY());

    }
    public void actionPerformed(ActionEvent e){
        String msg= ""+e.getSource();
        t.setText(""+msg);

    }
    public static void main(String[] args){
        new Test7();
    }
    
}
