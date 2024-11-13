import java.lang.reflect.Array;
import java.util.ArrayList;

public class multiD_array_list {
    public static void main(String[] args) {

        // 2D = dynamic list of lists
        //we can change the size of these lists in runtime

        ArrayList<ArrayList<String>> grocery  = new ArrayList();


        ArrayList<String> Drinks = new ArrayList();
        Drinks.add("rum");
        Drinks.add("milk");
        Drinks.add("coca cola");

        ArrayList<String>  Bakery  =new ArrayList();
        Bakery.add("bread");
        Bakery.add("pasta");
        Bakery.add("cake");

        ArrayList<String>  Produce  =new ArrayList();
        Produce.add("potato");
        Produce.add("tomatoes");
        Produce.add("cheese");

        grocery.add(Drinks);
        grocery.add(Bakery);
        grocery.add(Produce);

        //System.out.println(grocery); // total sum of everything grocery
        //System.out.println(grocery.get(0)) ; //index 0 that is drinks list is printed
        System.out.println(grocery.get(0).get(1)); //index 0 ko second  element prints



    }
}
