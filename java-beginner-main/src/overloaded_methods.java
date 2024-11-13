public class overloaded_methods {
    public static void main(String[] args) {

        //overload methods =method that share same name but have different parameters
        // method name + parameters=method signature

        int z= add(2,3);//similarly we can pass more values upto d
        // double z=add(3.2,4.0);

        System.out.println(z);


    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;

    }
    static int add(int a, int b,int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;

    }
    static int add(int a, int b,int c,int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;

    }
    static double add(double a, double b) {
        System.out.println("This is overloaded method #4");
        return a + b;
    }
}
