package accessmodifier2;
import accessmodifier1.*;

import java.util.SplittableRandom;


public class C {

    public String PublicMessage="this is public";

    String DefaultMessage= "this is default";


    protected String ProtectedMessage ="this is protected"; //sthg that is protected is accessible to diff class in diff package as long as it is subclass of class containing protected member

    private String PrivateMessage ="this is private"; //only visible to the class  that it contains itself
}
