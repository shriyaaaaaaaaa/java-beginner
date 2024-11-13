import java.util.Scanner;


public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("what is your age");
        int age = scanner.nextInt();
        scanner.nextLine(); //to clear the scanner
        System.out.println("fav food?");
        String food = scanner.nextLine();


        System.out.println("my name is " + name);
        System.out.println("my age is " + age);
        System.out.println("my fav food is " + food);


    }
}
