public class Static_keyword {

    //static-modifier. a single copy of a variable/method is created and shared.
            // a class "owns" a static member

    public static void main (String[] args)
    {
        Friend friend1= new Friend("aavash");
        Friend friend2= new Friend("prince");
        Friend friend3= new Friend("sejal");

        //for variable
        System.out.println(Friend.NoOffFriends); //name of the class that owns static member
                                                // it gives total no.of friends
                                                //all instances of friends class are forced to share the same static member
        //for method
        Friend.display();



    }

    public static class Friend {
        String name;
        static int NoOffFriends;  //if we remove static we can no longer in 13 access variable in static way and should use friend1,2,3.


        Friend(String name) {
            this.name = name;
            NoOffFriends++;
        }

        static void display()
        {
            System.out.println("you have "+NoOffFriends+" friends");
        }
    }
}
