package com.company;

import java.util.Scanner;

public class HomWork {
    public static void main (String[]args) {
        System.out.println(" Напишите Таблицу умножения ");
        System.out.println("      !проверь себя!         ");

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println(x1+"*"+y1+"=");
        System.out.print("результат умножения первого чила на втрое  = ");


        int c = sc.nextInt();
        if ( c ==(x1*y1)){
            System.out.println(" верно "+(x1*y1) );
        }else {
            System.out.println(""+(x1*y1));
        }}}





