import java.util.InputMismatchException;
import java.util.Scanner;

public class exception_handling {

    public static void main(String[] args) {
        // exception= event that occurs during the execution of a program that disrupts the normal flow of instructions
        Scanner scanner = new Scanner(System.in);

        try { //trying the dangerous code


            System.out.println("what is the whole number to divide?");
            int x = scanner.nextInt();

            System.out.println("what is the whole number to divide by?");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("result: " + z);


        } catch (ArithmeticException e) { //for specific exceptions
            System.out.println("you cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("please enter a number");
        } catch (Exception e) { //for all exceptions
            System.out.println("this is invalid");
        }
        finally {  //close any scanner or files that might be open
            scanner.close();
        }


    }



}
