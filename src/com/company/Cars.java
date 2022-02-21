package com.company;

public class Cars {

    String tape;// вид
    int age;// возрост
    String brand; // производитель
    int weight;// вес
    String color; //цвет
    String appointments; // назначения
    Cars(){

    }
 Cars(String tape,int age,String brand,int weight,String color,String appointments){
     this.age=age ;
     this.weight=weight ;
     this.brand=brand  ;
     this.tape=tape ;
     this.color=color ;
     this.appointments=appointments ;

 }

    public void method() {
        System.out.println(" что  это ");
    }
}

