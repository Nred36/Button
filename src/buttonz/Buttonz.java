/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author naree1878
 */
public class Buttonz {

    int x = 1350, y = 50;
    JFrame f = new JFrame("");
    JButton b1 = new JButton("Switch");
    JPanel p = new JPanel();

    public void Bonz() {
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(x, y);
        f.getContentPane().add(p);

        p.add(b1);
        p.setLayout(null);

        b1.setBounds(0, 0, 123, 23);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b1.setText(x+","+y);
                y +=50;
                x-=50;
                Bonz();
            }
        });
    }

    public Buttonz() {

        Bonz();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buttonz red = new Buttonz();
    }

}
