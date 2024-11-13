import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= "";


        while(name.isEmpty())  //continues to show enter name option if name is empty
        {
            System.out.print("Enter your name:");
            name= scanner.nextLine();
        }
        System.out.println("Hello "+name);


        // alternatively we can also use do-while loop. performs block of code once and check the condition after.
/*
        do{
            System.out.print("Enter your name:");
            name= scanner.nextLine();
        }while(name.isEmpty());
        System.out.println("Hello "+name);

*/


    }
}
