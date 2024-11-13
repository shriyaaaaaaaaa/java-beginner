public class Switch {
    public static void main(String[] args) {

        String day="Monday";

        switch(day){

            case "Sunday": System.out.println("It is sunday");
            break;  //Incase the break is not given after each cases then it will print the given day which in this case is monday and all the subsequent day after.
            case "Monday": System.out.println("It is monday");
            break;
            case "Tuesday": System.out.println("It is tuesday");
            break;
            case "Wednesday": System.out.println("It is wednesday");
            break;
            case "Thursday": System.out.println("It is thursday");
            break;
            case "Friday": System.out.println("It is friday");
            break;
            case "Saturday": System.out.println("It is saturday");
            break;
            default: System.out.println("Invalid day");

        }

    }
}
