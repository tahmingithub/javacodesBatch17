package class20;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {
    public static void main(String[] args) {

        JFrame frame=new JFrame();  // class
        MyCanvas c=new MyCanvas();

        frame.setSize(2000,2000);
        frame.add(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class MyCanvas extends Canvas{
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
       g.fillOval(200,200,500,500);
       g.setColor(Color.black);
       g.fillRect(800,200,500,500);
    }
}