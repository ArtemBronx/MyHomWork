package com.company;

public class A {
   static int a=0;

    int b=0;
static {
    System.out.println("static initialize ");

}
A(){
    System.out.println("constructor");
}
void c(){
    a+=1;// не статическое  нельзя  использовать
}
}

