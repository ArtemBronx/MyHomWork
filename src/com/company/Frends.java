package com.company;

public class Frends {
    public static void main(String[] args) {

      /*  Friend friend=new Friend("Jon");
        Friend friend1=new Friend("Valter", 21 );
        Friend friend2=new Friend( "Gavr", 23, "men" );




    friend.say();
    friend1.say();
    friend2.say();

}

       */
        Cat cat = new Cat("Baci");
        Cat cat1 = new Cat("Baci", 7);
        Cat cat2 = new Cat("Baci", 7, 23);
        Cat cat3 = new Cat("Baci", 7, 23);
        Cat cat4 = new Cat(23, "blak");
        Cat cat5 = new Cat(23, "blak", cat.Address);


        System.out.println("cat1" + cat1.name + " " + cat1.age);
        System.out.println("cat2" + cat2.name + " " + cat2.age);


        cat.say();
        cat1.say();
        cat2.say();
        cat3.say();
        cat4.say();
        cat5.say();
    }
}