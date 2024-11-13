import accessmodifier2.C;

public class copy_objects {

    public static void main(String[] args)
    {
        Car car1=new Car("chevrolet","Camaro",2021);

        //Car car2=new Car("red","Ford",2019);


        //car2=car1;   this is not a correct way to copy obj since both of these are stored in same address in system
        //            appeared to be copied over but are just pointing to same car in memory

        //car2.copy(car1); //now it is stored in diff memory and is copied

        Car car2=new Car(car1);  //we assign the values of car1 to car2 when we construct the car obj


        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getYear());
        System.out.println(car1.getModel());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getYear());
        System.out.println(car2.getModel());



    }
    public static class Car {

        private String make;
        private String model;
        private int year;

        Car(String make, String model, int year) {

            this.setMake(make);
            this.setModel(model);
            this.setYear(year);
        }
        Car(Car x ){
            this.copy(x);

        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }


        //setter =used to make changes to values of priv attributes

        public void setMake(String make) {
            this.make = make;

        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void copy(Car x)
        {
            this.setMake(x.getMake());
            this.setModel(x.getModel());
            this.setYear(x.getYear());
        }
    }


}
