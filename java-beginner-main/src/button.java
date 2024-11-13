import javax.swing.*;
import java.awt.*;

public class button {

    public static void main (String[] args){

        ImageIcon icon =new ImageIcon("C:\\Users\\shriya\\Desktop\\thumbs-up.png");

        ImageIcon img =new ImageIcon("C:\\Users\\shriya\\Desktop\\logo.png");

        JLabel label =new JLabel();
        label.setIcon(img);
        label.setBounds(150,250,150,150);
        label.setVisible(false);



        JButton button =new JButton();
        button.setBounds(50,100,105,55);
        button.addActionListener(e-> label.setVisible(true));
                //(e -> System.out.println("yayay"));
        button.setText("press me!");
        button.setFocusable(false); //text set garda ako border erase gardincha
        button.setIcon(icon);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.CENTER);
        button.setFont(new Font("italic",Font.BOLD,25));
        button.setIconTextGap(-10);
        button.setForeground(Color.blue);
        button.setBackground(Color.white);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false); disables the button

        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(label);


    }
}
