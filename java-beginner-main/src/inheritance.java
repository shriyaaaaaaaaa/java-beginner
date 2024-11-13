public class inheritance {
    public static void main(String[] args)
    {
      // inheritance =the process where one class inherits attributes and methods of other
        Car car = new Car();
        
        //car.brake();
        //car.go();

        Bicycle bicycle=new Bicycle();

        //bicycle.brake();
        //bicycle.go();

        System.out.println(car.wheel);
        System.out.println(bicycle.pedals);





    }

    public static class vehicle {
        Double speed;

        void brake() {
            System.out.println("the car is stopping");

        }

        void go() {
            System.out.println("the car is moving");
        }
    }


    public static class Car extends vehicle{
        // car inherits properties from parent class vehicle
        //besides it may have its own attributes
        int wheel =4;

    }
    public static class Bicycle extends vehicle{
        int pedals=2;
    }
}
