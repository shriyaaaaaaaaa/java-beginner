import java.util.Random;

public class variable_scope {

    public static void main(String[] args) {


        //local = declared inside a method and is visible only to that method
        //global = declared outside a method but within a class, visible to all parts of a class

        Diceroller diceroller= new Diceroller();


    }
/* local variable
    public static class Diceroller {



        Diceroller() {

            Random random = new Random();
            int number=0;
            roll(random, number); //passing args to method

        }
            void roll (Random random, int number)
            {
                number  = random.nextInt(5)+1;
                System.out.println(number);


            }

    }

 */

    public static class Diceroller {
        Random random;
        int number; //no need to initialize in global


        Diceroller() {
            random = new Random();
            roll();
        }

        void roll() {
            number = random.nextInt(5)+1;
            System.out.println(number);
        }
    }

}

