import java.util.Scanner;

public class logical_operator {
    public static void main(String[] args) {

        /*logical operator is used to connect two or more expressions
               && (AND) both conditions must be true
               || (OR) either conditions must be true
               ! (NOT) reverses boolean value of condition  */


/*   //for AND OPERATOR USE
        int temperature=35;

        if(temperature>=25)
        {
            System.out.println("IT IS A HOT DAY!");
        }
        else if(temperature>=20 && temperature<=25)
        {
            System.out.println("IT IS A WARM DAY!");
        }
        else 
        {
            System.out.println("IT IS A COLD DAY!");
        }
*/


       // for OR operator use
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the q or Q to quit playing ");
        String response= scanner.next();
/*
        if(response.equals("q")|| response.equals("Q"))
        {
            System.out.println("Thank you for playing !");

        }
        else
        {
            System.out.println("you are still playing the game !");
        }
        */

        //for OR operator
        if(!response.equals("q")&& !response.equals("Q"))
        {
            System.out.println("you are still playing the game");

        }
        else
        {
            System.out.println("Thank you for playing game !");
        }




    }
}
