public class overloaded_constructors {


    public static void main(String[] args) {

        Pizza pizza = new Pizza("pepperoni","tomato");
        System.out.println("The ingredients used in your pizza is:");
        System.out.println(pizza.toppings);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);// this if printed will display null

    }

    public static class Pizza {
        String toppings;
        String sauce;
        String cheese;

        Pizza(String toppings, String sauce, String cheese)
        {
            this.toppings=toppings;
            this.sauce=sauce;
            this.cheese=cheese;

        }
        //if we only need to display 3 ingredients
        Pizza(String toppings, String sauce)
        {
            this.toppings=toppings;
            this.sauce=sauce;

        }
        Pizza(String toppings)
        {
            this.toppings=toppings;

        }
        Pizza()
        {
            //no args and no parameters

        }






    }
}
