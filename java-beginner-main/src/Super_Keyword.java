public class Super_Keyword {

    public static void main(String[] args){

        //super=keyword that refers to parents of the object
        Hero hero1=new Hero("Batman",45,"flying");
        Hero hero2=new Hero("Superman",55,"fast");


       System.out.println(hero1.name);
       System.out.println(hero1.age);
       System.out.println(hero1.power);


        System.out.println(hero2.toString());



    }
    public static class Person
    {
        String name;
        int age;

        Person(String name,int age){

            this.name=name;
            this.age=age;
        }

        public String toString()
        {
            return this.name + "\n" +this.age+ "\n";
        }

    }

    public static class Hero extends Person
    {
        String power;

        Hero(String name, int age,String power)
        {
            super(name,age);
            this.power=power;

        }
        public String toString() {
            return super.toString()+this.power;
        }

    }
}
