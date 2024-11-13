import java.util.Random;

public class random_values {
    public static void main(String[] args) {

        Random random=new Random();

        //int x=random.nextInt(); //this gives random no. from -2b to +2b
        //int x=random.nextInt(6);// this limits the value of int from 0 to 5 i.e 6 no.
        int x=random.nextInt(6)+1;//gives rand value from 1 to 6

        double y=random.nextDouble(); // gives value between 0 and 1
        boolean z=random.nextBoolean(); //true or false

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);



    }
}
