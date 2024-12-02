import javax.swing.*;
import java.awt.*;

public class Borderlayout {

// BorderLayout: places component in five areas : NORTH,SOUTH,EAST,WEST,CENTER
    //           all extra space is placed in center areas

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10, 10)); //margin for width and height. optional
        frame.setSize(500, 500);


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.orange);
        panel5.setBackground(Color.green);

        panel1.setPreferredSize(new Dimension(200, 200));
        panel1.setPreferredSize(new Dimension(100, 100));
        panel1.setPreferredSize(    new Dimension(100, 100));
        panel1.setPreferredSize(new Dimension(100, 100));
        panel1.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.NORTH);
        frame.add(panel3, BorderLayout.WEST);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.SOUTH);


    }
}

