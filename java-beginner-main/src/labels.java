import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class labels {
    //label: a GUI display area for string of text, images or both.

    public static void main (String[] args){

        ImageIcon image= new ImageIcon("C:\\Users\\shriya\\Desktop\\logo.png");
        Border border= BorderFactory.createLineBorder(Color.blue);

        JLabel label = new JLabel(); //create a label
        label.setText("you can add this in jlabel ko parenthesis bhitra pani"); //set text to label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left,right,center of image icon
        label.setVerticalTextPosition(JLabel.TOP); //set text top,bottom, center of image icon
        label.setForeground(new Color(0,244,3)); //set font color
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); //set font of text
        label.setIconTextGap(200); //could also be set to minus if tala tira ladai janey bhaye
        label.setBackground(Color.black); //set bg color
        label.setOpaque(true); //we need to set this to display bg color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical pos of icon + text within label.
        label.setHorizontalAlignment(JLabel.CENTER); //now even if we resize both remains in center
        //label.setBounds(100,100,550,550); //set layout null le kei diyena tespachi hamle label ko w, h ra dimensions define gareko
        //                                              so that entire frame cover nagaros.

        JFrame frame= new JFrame();
        frame.setSize(300,300);
        frame.setVisible(true);
        //frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(label); //pack last ma huna paryo
        frame.pack(); // adjust to accomodate whatever within label. thikka ko hunchha

    }
}
