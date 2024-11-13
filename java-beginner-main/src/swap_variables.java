public class swap_variables {
    public static void main(String[] args) {
        String x="water";
        String y="coke";
        String temp; //or temp=null

        temp = x; //or y
        x=y;
        y=temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }

}
