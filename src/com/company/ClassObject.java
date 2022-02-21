package com.company;

public class ClassObject {
    public static void main(String[]args){
       /* Human human1= new Human();
        Human human2= new Human("Red",25);
        Human human3= new Human("Red");
        */
        Car car= new Car("BMW","530","Sedan ",2022,"Gazolina");
        Dog dog = new Dog("Ванючка",33,"Пикинес");
        Human human4= new Human ("volodya", "Belarus",dog,car );

        /*human1.say();
        human2.say();

        human3.say();
         */
        human4.say();

    }

}
