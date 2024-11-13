
import java.util.Scanner;

public class nested_loop {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int rows;
        int column;
        String Symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scan.nextInt();
        System.out.println("Enter # of columns: ");
        column = scan.nextInt();
        System.out.println("Enter Symbol: ");
        Symbol = scan.next();


        for (int i = 1; i<= rows; i++) {
            System.out.println();
        for (int j = 1; j<= column; j++) {
            System.out.print(Symbol);
        }
        }
    }
    }
