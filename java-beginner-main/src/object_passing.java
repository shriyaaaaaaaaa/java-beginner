public class object_passing {
    public static void main(String[] args){


        Garage garage=new Garage();

        Car car =new Car("mustang");
        Car car1 =new Car("BMW");

        garage.park(car);
        garage.park(car1);




    }

    public static class Garage
    {
        void park(Car car)
        {
            System.out.println("This "+car.name +" is parked in garage");
        }

    }

    public static class Car
    {
        String name;

        Car(String name)
        {
            this.name=name;

        }

    }
}
