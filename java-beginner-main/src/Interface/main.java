package Interface;



//interface= a template that can be applied to a class
//           similar to inheritance but specifies what a class must do
//            classes can apply more than one interface, while inheritance is limited to 1 super class

public class main {

    public static void main(String[] args){

        Rabbit rabbit =new Rabbit();
        rabbit.flee();


        Hawk hawk=new Hawk();
        hawk.hunt();

        Fish fish=new Fish();
        fish.flee();
        fish.hunt();
    }
}
