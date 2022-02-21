package com.company;

import java.util.Random;
import java.util.Scanner;

public class ClassWork3 {
    public static void main(String[] args) {

     /*   Scanner sc = new Scanner(System.in);
       int sum = 0 ;
       for(int i=0 ;i<5 ;i++){
           int a = sc.nextInt();
           sum += a;
       }
        System.out.println(sum);
*/

        //  Rundom - тип  random = new Random();
        //
      /*  Random random= new Random();
        for (int i=1; i<50; i++ ){
            System.out.println(random.nextInt(199));
        }*/
       /* int [] bmw = new int[9];
        bmw[0] = 1;
        bmw[1] = 2;
        bmw[2] = 5;
        bmw[3] = 6;
        bmw[4] = 8;
        bmw[5] = 3;
        bmw[6] = 4;
        bmw[7] = 0;

        System.out.println("модель ");
        for (int i=9;i<9; i++){
            System.out.println(bmw +" ");

        }*/

        /*double[]array= new double [100];{ // родом в массиве
         Random random= new Random();
           for( int i = 0; i< array.length; i++)
          {
            array[i]= random.nextDouble();
            {
                System.out.println(array[i]);

            }*/

       /* int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }*/
        Random random = new Random();//
        int [][]array = new int[5][5];

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + "");
            }

            System.out.println();
        }
           int sum=0;
            for (int i = 0;i< array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array.length - 1 - i == j) {
                        sum += array[i][j];
                    }
                }
            }
                System.out.println(sum);
}}
