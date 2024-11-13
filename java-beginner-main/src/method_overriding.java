import java.awt.dnd.DropTargetDragEvent;

public class method_overriding {


    //method overriding =Declaring a method in subclass, which is already present in parent class.
    //                    done so child class have its own implementations
    public static void main(String[] args)
    {
        Animals animals= new Animals();
        animals.speak();

        Dog dog =new Dog();
        dog.speak(); //calls the method more closer.


    }


    public static class Animals{
        void speak()
        {
            System.out.println("The animal makes noise");
        }
    }

     //@Override
    public static class Dog extends Animals
    {
        void speak()
        {
            System.out.println("the dog is barking");
        }
    }
}
