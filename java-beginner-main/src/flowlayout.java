import javax.swing.*;
import java.awt.*;

public class flowlayout {

    public static void main(String[] args){
  // FlowLayout: places component on row, with their preferred size.
        //      if horizontal space in container is too small it uses next available row

        JFrame frame =new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.TRAILING,10,10));

        JPanel panel=new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));


        /*frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6")); */





    }
}
