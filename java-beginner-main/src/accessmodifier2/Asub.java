package accessmodifier2;

import accessmodifier1.*;

public class Asub extends A {


    /*public static void main(String[] args) {
        C c = new C();
        System.out.println(c.DefaultMessage);   //default messages are visible only to the class within the same package

    }

     */

    public static void main(String[] args){
        Asub asub = new Asub();
        System.out.println(asub.ProtectedMessage);


    }
}