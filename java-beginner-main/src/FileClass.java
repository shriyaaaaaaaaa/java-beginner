import java.io.File;

public class FileClass {

    //file=abstract representation of file and directory path names.

    public static void main(String[] args)
    {

        File file=new File("java.txt"); //include file extension like .txt
        //                                       we look at the project folder as inital directory
        //File file =new File("C:\\Users\\shriy\\OneDrive\\Desktop\\java.txt"); //either two backslash or one front slash
        //                                                                             when we have to look for file outside the project folder

        if(file.exists()){
            System.out.println("the file exist");
            System.out.println(file.getPath()); //whatever is listed in constructor of file class
            System.out.println(file.getAbsolutePath());  //full file path
            System.out.println(file.isFile()); //returns true if file otherwise folder or sthg false
            file.delete();  //deletes the file in project folder after use
        }
        else{
            System.out.println("the file does not exists");
        }
        

    }
}
