import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {
    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);

        this.add(label);


        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keyTyped  =  Invoked when a key is typed. Uses keyChair, char output

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed   =  Invoked when a physical key is pressed down.Uses KeyCode, int output

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //keyReleased  =  called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());

    }
}
