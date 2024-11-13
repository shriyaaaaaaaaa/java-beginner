import javax.swing.*;
import java.awt.*;


public class GUI {

    public static void main (String[] args) {

        //Jframe=  a gui window to add components to

        JFrame frame = new JFrame(); //creates a frame.
        frame.setVisible(true); // make frame visible
        frame.setSize(400,400); //set size of frame
        frame.setTitle("jframe title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //can have other option like do nthg on close.
        frame.setResizable(false); //prevents frame from being resized.

        ImageIcon image=new ImageIcon("C:\\Users\\shriya\\Desktop\\logo.png");  //create image icon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(0,255,255)); //change color of background
    }
}
