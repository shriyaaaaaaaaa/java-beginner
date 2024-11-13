public class printf_method {
    public static void main(String[] args) {

        // printf= an optimal method to control, format and display text to the console window
        // two arguments = format string + (object/variable/value)
        //  % [flags] [precision] [width] [conversion-character]  
        boolean myboolean=true;
        char mychar='a';
        int myint=10;
        String mystring="BRO";
        double mydouble=1000;

        //[conversion character]
        /* System.out.printf("%b",myboolean);
        System.out.printf("%c",mychar);
        System.out.printf("%d",myint);
        System.out.printf("%f",mydouble);
        System.out.printf("%s",mystring);

         */




         //[width] - min no. of characters to be written as output
        //System.out.printf("Hello %10s",mystring); //after space in hello +10 right justifies 10 character including the bro


        //[precision] - set no. of digits of precision when outputting floating point values
        //System.out.printf("you have this much money %.2f",mydouble); // gives 2 digit after the decimal

        //[flags] - adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + :output a plus(+)  or  minus(-) sign for a numeric value
        // 0 : numeric values are zero padded
        // , : comma grouping separator if numbers>1000

        //System.out.printf("you have this much money %-20f",mydouble);
        //System.out.printf("you have this much money %+f",mydouble); //if the mydouble is negative it shows -10 otherwise +10
         //System.out.printf("you have this much money %020f",mydouble); //padding of no. of 0 according to left/right justified
        System.out.printf("you have this much money %,f",mydouble); //separates the value w comma













    }
}
