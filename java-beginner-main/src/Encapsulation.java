public class Encapsulation {


    public static void main(String[] args)
    {
        Car car=new Car("chevrolet","Camaro",2021);

        //System.out.println(car.make); car.make isnot visible because all the attributes are private
        car.setYear(2022);

        System.out.println(car.getMake()); //access getter method
        System.out.println(car.getYear());
        System.out.println(car.getModel());



    }

    public static class Car{

        private String make;
        private String model;
        private int year;

        Car(String make,String model,int year)
        {

          /* this.make=make;
           this.model=model;
           this.year=year;
           
           */



           //since we set make in setter method so call set method in constructor
            this.setMake(make);
            this.setModel(model);
            this.setYear(year);



        }

        //getter method = used to retrieve values of variable.

        public String getMake(){
            return make;
        }
        public String getModel(){
            return model;
        }
        public int getYear(){
            return year;
        }



        //setter =used to make changes to values of priv attributes

        public void setMake(String make)
        {
            this.make=make;

        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setModel(String model) {
            this.model = model;
        }
    }
}
