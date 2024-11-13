import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class filereader{

    public static void main(String[] args) {
        //FileReader= reads the content of file as stream of character. one by one read() returns int value
        //             which contains byte value. when read() returns -1 there is no more data to be read
        try {
            FileReader reader = new FileReader("sthg.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();


        }
    }
}
