public class array {
    public static void main(String[] args) {
        //array is used to store multiple values in  single variable

        String[] cars =new String[3];
        cars[0]="Maze";
        cars[1]="Honda";
        cars[2]="Ford";

        for (int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }


        /*String[] cars = {"mustang","BMW", "toyota"};
        cars[0]="tesla";


        System.out.println(cars[3]);

*/
    }
}
