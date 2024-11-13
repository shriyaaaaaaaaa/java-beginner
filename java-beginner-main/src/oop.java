public class oop {
    public static void main(String[] args) {

        //object = an instance of a class that may contain attributes and methods
        car mycar= new  car(); //oop.car class object is mycar w below attributes
        //car mycar2= new car(); //we can use same class to create multiple object
        //System.out.println(mycar.model);
        //System.out.println(mycar.make);

        mycar.brake(); //calling brake method of mycar





    }

    public static class car {
        String make="chevrolet";
        String model="corvette";
        int year=2020;
        String color="red";
        double price=1000000.0000;

        void drive()
        {
            System.out.println("you drive the car");

        }
        void brake()
        {

            System.out.println("you break the car");
        }


    }
}

