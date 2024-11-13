import javax.swing.*;
import java.awt.*;

public class panel {

    public static void main( String[] args){
        //Jpanel: a GUI component that functions as a container to hold other components.

        JPanel redpanel=new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);

        JPanel bluepanel=new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);

        JPanel greenpanel =new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,250);
        greenpanel.setLayout(new BorderLayout());

        ImageIcon image= new ImageIcon("C:\\Users\\shriya\\Desktop\\thumbs-up.png");


        JLabel label= new JLabel();
        label.setText("hey hi hey");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);



        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        greenpanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
    }
}

//or use bounds instead of setverticalalignment on labels