import java.util.ArrayList;

public class for_each {
    public static void main(String[] args) {

    //for-each: traversing technique to iterate through the elements in an array/collection

        //String[] animals ={"cat","dog","frog"};
    ArrayList<String> animals = new ArrayList<String>();
    animals.add("Cat");
    animals.add("Dog");
    animals.add("frog");

        for(String i:animals)
        {
            System.out.println(i);
        }




    }
}
