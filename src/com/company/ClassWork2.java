package com.company;

import java.util.Scanner;

public class ClassWork2 {
    public static void main(String[] args) {

       /* int i =10 ;
        while (i>0){
            System.out.println(i);
            i --;
        }
                    */
           /* int i =0;

            while (i<10) {
                int j = i;
                while (j<10){
                    System.out.print("." );
                    j++;}
                System.out.println();   //схема внутри  цикал
                i ++;

                  */

      /*  int i= 0;
        do {
            System.out.println(i);
            i++;}
        while (i<10);*/

      /*  Scanner in = new Scanner(System.in );// схема
        System.out.println(" keyBord "); // схема ввода на  клавиатуре
            String keyBord = in.nextLine(); // схема
        switch (keyBord){

            case "for":
                for ( int i = 0; i<10;i++) {
                System.out.println(i);}
                break;

            case "while":
                int i = 1;
                while (i <= 10) {
                    if (i % 2 <= 0) {
                        System.out.println(i);}
                    i++;}
                break;


            case "do-while":
                    int j=0;
                    do{
                        if (j%2 !=0)
                            System.out.println(j);
                        j++;
                        }while (j<10);

                    break;
        }}*/


       /* Scanner in = new Scanner(System.in ); // надеюсь это не  надо будет  делать  !!!
        System.out.println( " Введите число Ф"); // fot+i
        int n= in.nextInt();
        int f1 = 1;
        int f2 = 1;
        int f = 0;
        for(int i= 2;i<n;i++){
          f =f1+f2;
          f1=f2;
          f2=f;

            System.out.println(f);


        }*/


       /* int i =0; // спосо рисовать точками

        while (i<5) {
            int j = i;
            int k = 5-j;
            while (j<5){
                System.out.print( "." );// выводит пробелы  перед точками
                j++;}


            while (k<10){
                System.out.print( "." );// ставит  точки
                k++;}
            System.out.println();
            i ++;


    }*/




        int [] array= new int[]{ 1, 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9, 10 };
        for( int i = 0; i<10; i++){
            System.out.println(array[i]);
            if(array[i]==5){
                System.out.println("Число найдено,выходим ");
                break;
            }
        }

        for( int i = 0; i<10; i++){
            if(array[i]==5){
                System.out.println(" переходим к следующей интеграции ");
                continue;}
            System.out.println(array[i]);



        }
        }}





