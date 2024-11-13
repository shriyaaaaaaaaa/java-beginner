import java.io.FileWriter;
import java.io.IOException;

public class FileWRITER {

    public static void main(String[] args){

//try is necessary for filewriter
        try{
            FileWriter writer = new FileWriter("java.txt");
            writer.write("roses are red \nviolets are blue \ni love you");
            writer.append("\nA poem by me");  //adds at the end
            writer.close();

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
