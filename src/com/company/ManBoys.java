package com.company;

import java.util.Scanner;

public class ManBoys {
    String name ;

    Child[] children;

    ManBoys(String name ,Child[] children){
        this.name=name;
        this.children=children;

    }
    void say(){
       System.out.println(" My name  is " + name + ".\n And I have " +children.length + " children " );
       for (int i = 0; i <children.length ; i++) {


           System.out.println(children[i].name+ " " +children[i].age+ " " + children[i].sex );
           System.out.println();

           }



       }
   }


