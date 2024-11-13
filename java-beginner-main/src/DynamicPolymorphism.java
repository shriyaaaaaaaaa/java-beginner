import javax.lang.model.element.AnnotationMirror;
import java.util.Scanner;

public class DynamicPolymorphism {


    // polymorphism= many shapes and form
    //dynamic= after compilation(during runtime)

    //we can declare an obj and make space for that in memory but not sure which type of obj we want. we want animal but dont know which kind so we make space for it

    public static void main(String[] args)
    {
        Animal animal;
        Scanner scanner = new Scanner(System.in);

        System.out.println("which animal do you like most");
        System.out.println("(2=cat) or (1=dog):");
        int choice= scanner.nextInt();

        if(choice==1){
            animal=new Dog();
            animal.speak();
        } else if (choice==2) {
            animal=new Cat();
            animal.speak();
        }
        else {
            animal=new Animal();
            System.out.println("this is an invalid option");
            animal.speak();
        }


    }
    public static class Animal{
        void speak(){
            System.out.println("the animal goes brrrrrrrrrr");
        }

    }
    public static class Cat extends Animal{
        @Override
        void speak(){
            System.out.println("the cat goes meowwwwww");
        }

    }
    public static class Dog extends Animal{
        @Override
        void speak()
        {
            System.out.println("the dog goes barrrrrrkkkkkkkk");
        }

    }
}
