//string is a reference data type that can store one or more characters
// reference data type that have one or more useful methods

public class string_methods {
    public static void main(String[] args) {
      String name= " Shriya";

        //Boolean result = name.equalsIgnoreCase("shriya"); //ignore case ignores the upper/lower case
        // int result=name.length(); //gives the length i.e 6
        //char result =name.charAt(0);//gives the character at index 0 which is S
        //int result=name.indexOf("S"); //gives the index of character which is 0
        //String result=name.toLowerCase(); //converts string to lowercase
        //String result=name.toUpperCase();
        //String result=name.trim(); // trims the space ahead and behind in case of String name="     Shriya   "
        String result=name.replace('i','e');





      System.out.println(result);


    }

}
