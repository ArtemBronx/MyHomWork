package com.company;

public class MainShape1 {
    public static void main(String[]args){
        Shape1 shape1 = new Shape1() {
            @Override
            void print() {

            }
        };
        Printer printer = new Printer();
        printer.print(shape1);
        Shape1 triangle1 = new Triangle1();
        Shape1 circle1 = new Circle1();
        printer.print(triangle1);
        printer.print(circle1);
        Animal2 animal2= new Animal2();
         Printer1 printer1=new Printer1();
         printer1.print1(animal2);
         Animal2 leo= new Leo();
         Animal2 tiger= new Tiger();
         printer1.print1(leo);
         printer1.print1(tiger);

    }
}
