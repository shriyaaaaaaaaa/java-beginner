public class tostring_method {

    //toString= special method that all objects inherit, that returns a string which textually represent obj.

    public static void main(String[] args)
    {
        Car car = new Car();

        //System.out.println(car); // if toString not done prints the address of object in computer memory

        //System.out.println(car.toString()); //explicitly used
        System.out.println(car); //implicitly used

    }


    public static class Car
    {
        String make ="Ford";
        String model = "Mustang";
        int year=  2021;

        public String toString() //return type is string so no void
        {
           /* String mystring =make +"\n"+ model +"\n" +year;
            return mystring;
            */
            return make +"\n"+ model +"\n" +year;

        }

    }
}
