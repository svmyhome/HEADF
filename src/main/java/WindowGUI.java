import com.sun.scenario.effect.impl.sw.java.JSWBlend_COLOR_BURNPeer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowGUI  {
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        WindowGUI wind1 = new WindowGUI();
        wind1.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Сарычев В.М.");
        button1.addActionListener(new btn1listenner());
        JButton button2 = new JButton("Bdfyjd");
        button2.addActionListener(new btn2Listenner());
        label = new JLabel("cdmckdmsckm");
        frame.getContentPane().add(BorderLayout.WEST, button1);
        frame.getContentPane().add(BorderLayout.NORTH, button2);
        frame.getContentPane().add(BorderLayout.SOUTH, label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class btn1listenner implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Нksdknvdsn");
        }
    }
    class btn2Listenner implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Нажата");
        }
    }

}
