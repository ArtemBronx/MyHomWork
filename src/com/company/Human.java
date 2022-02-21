package com.company;

public class Human {
     String name;
     int age;
     String from;
     Dog dog;
     Car car;
     Human(){

     }
     Human(String name,int age){
         this.name=name;
         this.age=age;
     }
     Human(String name){
         this.name=name;
     }
     Human(String name,String from,Dog dog,Car car ){
         this.from = from;
         this.dog=dog;
         this.car=car;
     }

     void say(){
         System.out.println("Hi, i  am "+ name + "I am" + age + "."+ "from "+from);
         System.out.println("У меня  есть  собака "+dog.name+ dog.age+ dog.breed);
         System.out.println(" у  меня  есть  тачка "+car.brand+car.modl+car.body+car.age+car.motor);
     }


}




