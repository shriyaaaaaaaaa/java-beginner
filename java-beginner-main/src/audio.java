import com.sun.security.jgss.GSSUtil;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class audio{

    public static void main (String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner= new Scanner(System.in);
        File file =new File("C:\\Users\\shriya\\Desktop\\audiosamples.wav");
        AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(file);  //throw exception
        Clip clip= AudioSystem.getClip();
        clip.open(audioInputStream);


        String response ="";


        while(!response.equals("Q")){
            System.out.println("P=play,S=stop,R=reset,Q=quit" );
            System.out.println("enter a choice:");

            response =scanner.next();
            response=response.toUpperCase();

            switch(response){
                case("P"): clip.start();
                break;
                case("S"):clip.stop();
                break;
                case("R"): clip.setMicrosecondPosition(0);
                break;
                case("Q"): clip.close();
                break;
                default:
                    System.out.println("not valid option");
            }

        }
        System.out.println("byeeeeee!");


    }
 }
