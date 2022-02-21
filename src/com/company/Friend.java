package com.company;

public class Friend {
    String name ;
    int age;
    String gender;
    Cat cat;

    Friend(){

    }
    Friend(String name){
        this.name=name;
    }
    Friend(String name,int age){
        this.name=name;
        this.age=age;
    }
    Friend(String name ,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    void say(){
        System.out.println("I am "+name+" I am "+ age );
        System.out.println("I am a "+ gender);
    }



}
