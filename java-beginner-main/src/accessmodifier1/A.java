package accessmodifier1;
import accessmodifier2.*;

public class A {

    protected String ProtectedMessage ="this is protected";

   public static void main(String[] args)
    {
        C c= new C();
        //System.out.println(c.DefaultMessage);  anything using default modifier is only visible within that package only
        //                                       in this case this print is possible in Asub which is in same package as C


        System.out.println(c.PublicMessage); //anything that uses public keyword is visible to any package of the project
    }



   /* public static void main(String[] args){
        B b =new B();
        System.out.println(b.PrivateMessage); //this is private so not possible
    }

    */


}
