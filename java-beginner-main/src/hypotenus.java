import java.util.Scanner;
public class hypotenus {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter x: ");
        x=scanner.nextDouble();
        System.out.println("Enter y:");
        y=scanner.nextDouble();

        z= Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse of triangle is "+z);

        scanner.close();




    }
}