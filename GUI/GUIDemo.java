import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIDemo extends JFrame implements ActionListener{

    private JTextField txt = new JTextField("0", 8);
    private JButton btn = new JButton("+");
    private JButton btn2 = new JButton("-");
    private JLabel lbl ; 
    private JPanel pnl1 = new JPanel(new FlowLayout());
    private JPanel pnl2 = new JPanel(new FlowLayout());

    public GUIDemo(){

        setLayout(new FlowLayout());

        lbl = new JLabel("GUI Demo");
        pnl1.add(lbl);
        add(pnl1);

        pnl2.add(txt);
        btn.addActionListener(this);
        pnl2.add(btn);
        pnl2.add(btn2);
        btn2.addActionListener(this);
        add(pnl2);




        setTitle("Counter");
        setSize(350, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    


    @Override
    public void actionPerformed(ActionEvent e) {
        int counter = Integer.parseInt(txt.getText());

        System.out.println();
        if(e.getSource().equals(btn)){
             counter++;
             if(counter == 10 )
             btn.setEnabled(false);
        }
             
        else 
             counter--; 

        txt.setText(counter+"");
       
    }



    public static void main(String[] args) {

        new GUIDemo();
    
    }








    
}
