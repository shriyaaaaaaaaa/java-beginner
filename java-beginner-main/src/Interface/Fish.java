package Interface;

public class Fish implements prey,Predator {


    @Override
    public void hunt() {
        System.out.println("the fish is hunting small fish");
    }

    @Override
    public void flee() {
        System.out.println("the small fishes are fleeing");

    }
}
