package com.company;

public class Cat {
    String name;
    int age = 7;
    int weight;
    String color;
    String Address = " minsk";

    Cat(String name){
        this.name = name;
    }
    Cat(String name,int age){
        this.name = name;
        this.age = age;}

    Cat(String name,int age,int weight){
        this.name = name;
        this.age = age;
        this.weight=weight;
    }
    Cat(int weight,String color){
        this.weight= weight;
        this.color= color;
    }
    Cat(int weight,String color,String address){
        this.weight=weight;
        this.color=color;
        this.Address=address;
    }

void say(){
    System.out.println(name+age+weight+color+Address);
}


}


