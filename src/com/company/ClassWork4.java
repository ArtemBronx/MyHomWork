package com.company;

import java.util.Random;

public class ClassWork4 {

    public static void main(String[] args) {
        /*Random random = new Random();

        int[][][] arrya = new int[3][3][3]; // 3  масив
        for (int i = 0; i < arrya.length; i++) {
            for (int j = 0; j < arrya[i].length; j++) {
                for (int k = 0; k < arrya[i][j].length; k++) {
                    arrya[i][j][k] = random.nextInt(10);
                    System.out.print(arrya[i][j][k] + "");
                }
            }
            System.out.println();
        }*/


     /*   Random random = new Random(); // 1 масив 10 элментов Вычислить всех сумму всех четных чисел
        int[] arrya = new int[10];
        int sum = 0;
        for (int i = 0; i < arrya.length; i++) {

            arrya[i] = random.nextInt(10);
            System.out.print(arrya[i] + " ");
            if (arrya[i] % 2 == 0) {

                sum += arrya[i];
            }

        }
        System.out.println();
        System.out.println(sum);*/

        /*Random random = new Random();
        int[] arrya = new int[10];
        int sum = 0;
        int sum1 = 0;
        int a = 0;
        for (int i = 0; i < arrya.length; i++) {

            arrya[i] = random.nextInt(5);
            System.out.print(arrya[i] + " ");
            if (arrya[i] % 2 == 0) {

                sum += arrya[i];
            }
        }
        System.out.println();
        System.out.println(sum);

        for (int j = 0; j < arrya.length; j++) {
            arrya[j] = random.nextInt(5);
            System.out.print(arrya[j] + " ");
            if (arrya[j] % 2 == 0) {
                sum1 += arrya[2];
            }
        }
        System.out.println();
        System.out.println(sum1);
        System.out.println(sum - sum1);
    }*/

       /* Random random = new Random();// matrica

        int[][] arrya = new int[4][5];
        int[][] arryaT = new int[5][4];
        for (int i = 0; i < arrya.length; i++) {
            for (int j = 0; j < arrya[i].length; j++) {
                arrya[i][j] = random.nextInt(5);
                arryaT[j][i] = arrya[i][j];

                System.out.print(arrya[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arryaT.length; i++) {
            for (int j = 0; j < arryaT[i].length; j++) {
                System.out.print(arryaT[i][j] + " ");
            }
            System.out.println();
        }*/


       /* int []  arrya = new int[1];
        int []  arrya1 = new int[2];
        int []  arrya2 = new int[3];
        Random random= new Random();
        for (int i = 0; i < arrya.length ; i++) {
            arrya[i] = random.nextInt(10);
            arrya1[i] = random.nextInt(10);
        }
            for (int i = 0; i < arrya.length ; i++) {
                System.out.println(arrya[i] + " ");
            }
            System.out.println();
        for (int i = 0; i <arrya.length ; i++) {
            System.out.println(arrya1[i]+" ");

        }
        for (int i = 0; i <10 ; i++) {
            if (arrya[i]>arrya1[i]){
                arrya2[i]= arrya[i];
            }else {
                arrya2[i]=arrya1[i];

                }
        }
        System.out.println();
        for (int i = 0; i <arrya.length ; i++) {
            System.out.println(arrya2[i]+ " ");

        }*/


        Random random = new Random();
        int[] arrya = new int[]{1, 2, 3, 4, 5};
        int[] arrya1 = new int[]{1, 2, 3, 4, 5};
        int[] arrya2 = new int[]{1, 2, 3, 4, 5};
        int[] arrya3 = new int[]{1, 2, 3, 4, 5};
        int[] arrya4 = new int[]{1, 2, 3, 4, 5};
        int[][] arryaM = new int[5][5];


        System.out.println(arrya1[0]);
        for (int i = 0; i < arryaM.length; i++) {
            for (int j = 0; j < arryaM[i].length; j++) {
                System.out.println(arryaM[i][j] + "");
            }
        }
    }
}





