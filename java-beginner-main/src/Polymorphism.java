import accessmodifier1.B;

public class Polymorphism {

    public static void main(String[] args)
    {
        // polymorphism= greek word for poly:many, morph:form
        //               ability of object to identify as more than one type

        Car car= new Car();
        Bicycle bicycle=new Bicycle();
        Boat boat = new Boat();


        Vehicle[] racers={car,bicycle,boat}; // all obj identify as vehicle so find common and make array of that name

       /* car.go();
        bicycle.go();
        boat.go();

        */


       for(Vehicle x: racers) {  // x represents vehicle we are currently working with
            x.go();
        }


    }

    public static class Vehicle{
        public void go(){

        }

    }
    public static class Car extends Vehicle{
        @Override
        public void go()
        {
            System.out.println("the car is moving");
        }
    }
    public static class Bicycle extends Vehicle{
        @Override
        public void go()
        {
            System.out.println("the bicycle is moving");
        }
    }
    public static class Boat extends Vehicle{
        @Override
        public void go()
        {
            System.out.println("the boat is moving");
        }
    }
}
