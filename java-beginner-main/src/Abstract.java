public class Abstract {

    //abstract = adds layer of security
                   //abstract classes cannot be instantiated, but they can have a subclass
                   //abstract  methods are declared without an implementation

    public static void main(String[] args)
    {
        //Vehicle vehicle = new Vehicle();   abstract classes cannot be instantiated
        Car car = new Car();

        car.go();


    }
    public static abstract class Vehicle
    {
        abstract void go(); //abstract method should not have body




    }
    public static class Car extends Vehicle
    {
        @Override
        void go(){
            System.out.println("this person is driving a car");
        }

    }


}
