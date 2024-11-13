

public class constructors {
    public static void main(String[] args) {

        Human human1 = new Human("Rick", 55, 70.5); //passing args to constructor is essential because it gives us the ability to give diff obj diff attributes
        Human human2 =new Human("morty", 18, 35);
        System.out.println(human1.name);
        System.out.println(human2.age);

        human1.eat(); //human1 uses eat method
        human2.drink();



    }

    public static class Human {
        String name;
        int age;
        double weight;

        Human(String name, int age, double weight) {   //constructor
            this.name = name; //assign value to object uses this keyword
            this.age = age;
            this.weight = weight;

        }
        void eat()
        {
            System.out.println(this.name+" is eating"); // this is used to access objects attributes from within its own class
        }
        void drink()
        {
            System.out.println(this.name+" is drinking");
        }


    }
}
