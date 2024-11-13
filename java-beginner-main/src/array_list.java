import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {

        //arraylist= a resizeable array, elements can be added and removed after compilation phase.

        ArrayList<String> food = new ArrayList<String>();
        food.add("Apple");
        food.add("Banana");
        food.add("Bread");



        food.set(0, "sushi"); //replaces index 0 element with sushi
        food.remove(2); //removes index 2 element
        food.clear(); //clears the array list



        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
        
    }

}
