public class methods {
   /* public static void main(String[] args) {
         //method=a block of code that is executed whenever it is called upon

        String name="Shriya";
         hello(name); //hello method have access to string variable of name
        //hello();
        //hello();   //we can call the method 3 separate times if we want to display hello 3  times.

    }
    static void hello(String title){ //we are calling hello method from static method of main
        System.out.println("hello  " +title ); //also w parameters we don't need to keep name of values same like we could write title in both and result is same
    }
    */

    /*public static void main(String[] args) {
        String name="shriya";
        int age=18;
        hello(name,age);
    }
     static void hello(String name,int age){
        System.out.println("Hello "+name);
        System.out.println("my age is  "+age);
     }
     */

    public static void main(String[] args) {
        int x=4;
        int y=6;

        int z= add(x,y);   //  or we can directly use System.out.println(add(x,y))
        System.out.println(z );
    }
     static int add(int x, int y) { //we will like to return int so int instead of void
        int z=x+y; //or we don't need this we can directly return x+y;
        return z;  //we need return statement for return type

     }
}
