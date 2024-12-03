import javax.swing.*;
import java.awt.*;

public class layoutpane {

    //LayoutPane: swing container that provides a third dimension for positioning comp.

    public static void main(String[] args){

        JLabel label1=new JLabel();
        label1.setOpaque(true);//so we can see this
        label1.setBackground(Color.blue);
        label1.setBounds(50,50,200,200);

        JLabel label2=new JLabel();
        label2.setOpaque(true);//so we can see this
        label2.setBackground(Color.black);
        label2.setBounds(100,100,200,200);

        JLabel label3=new JLabel();
        label3.setOpaque(true);//so we can see this
        label3.setBackground(Color.red);
        label3.setBounds(150,150,200,200);

        JLabel label4 =new JLabel();
        label4.setOpaque(true);//so we can see this
        label4.setBackground(Color.cyan);
        label4.setBounds(0,0,200,200);


        JLayeredPane layeredPane=new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(1));
        layeredPane.add(label3, Integer.valueOf(2));
        layeredPane.add(label4, Integer.valueOf(3));  //higher the no. tetti agadi aucha

        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.add(layeredPane);
    }
}
