# MyHomWork
My first repo

import java.util.Arrays;
import java.util.Random;

public class HomWork2 {

    public static void main(String[] args) {

    int[] array = new int[]{8, 3, 15, 6, 4, 2,};//Определить индексы четных элементов массива
        int[] array1 = new int[]{0, 3, 4, 5 };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
        System.out.println();
        for ( int i =  0 ; i < array.length ;i ++ ) {
            if (array[i] %  2  ==  0 ) {
                array1[i] = i;}

                System.out.println("Index: " + i + "; Number: " + array[i]);
            }


        }}




      
         int[] array = new int[]{8, 3, 15, 6, 4, 2};// Среднее арифметическое положительных элементов массива
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == sum) {
                sum += array.length;
                {
                    System.out.println("Среднее арифметическое = "+ sum);
                }

            }

        }}}
            


           Random rondom =  new Random();  //Максимальный отрицательный элемент массива
            int [] array =  new  int [ 10 ];
            int max =   20 ;
            int min =  - 20 ;
            int maxNegative = array [ 0 ];
            int position = 0;

            for ( int i =  0 ; i < array .length; i ++ ) {
                array [i] =rondom.nextInt((max - min) +  1 ) + min;
                System.out.println(array[i] +  "  " );
            }
            for ( int i =  0 ; i <array.length; i ++ ) {
                if (array[i] <  0 ) {

                    maxNegative = array[i];
                    break;
                }
            }
            for ( int i =  0 ; i < array.length ; i ++ ) {
                if (array[i] <  0  && array [i] > maxNegative) {

                    maxNegative = array[i];
                    position = i;
                }
            }
        System.out.println( "Максимальный отрицательный элемент массива имеет индекс "  + position +  " и = "  + maxNegative);
        }}


      

       Random random= new Random();// Число, чаще всего встречающееся в массиве
        int[] array = new int[10];
        int[] array1 = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j & array[i] == array[j]) {
                    array1[i]++;
                    if (index < array1[j]) {
                        index = j;
                    }
                }
            }
        }
        if (index == 0) {
        } else {
            System.out.print("Самое часто встречающееся число в массиве: " + array[index]);
        }


         }}   

     

      int[] array = new int[20];// Найти наибольший элемент и его порядковый номер в массиве
           Random random = new Random();
        int max = array[0];
        int index = 0;
        for (int i = 0; i <array.length ; i++) {
                        array[i]= random.nextInt(20);
            if (array[i]>max){
                max=array[i];
                index= i;
                break;
            }
            System.out.println(array[i]+ " ");
        }
        System.out.println(max);
        System.out.println(index);
         }}
  

 
      int[] array = new int[20]; //  Поменять местами минимальный и максимальный элементы

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.println(array[i] + " ");
        }
        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            } else {
                if (array[i] < min) {
                    min = array[i];
                    indexMin = i;

                }
                continue;
            }
            System.out.println();
            System.out.println(max + " " + min);
            int array1 = array[indexMax];
            array[indexMax] = array[indexMin];
            array[indexMin] = array1;
            for (int k : array) {
                System.out.println(k + "  ");
            }
        }

  


        int [] arrya= new int[]{5,7,8,15,9};//  Сдвиг массива
        int  sum = 5;
        for ( int i=  0 ; i < sum; i ++ ) {
            for (int j = 0; j < arrya.length - 1; j++) {
                arrya[j] = arrya[j + 1];
                System.out.println(Arrays.toString(arrya));

            }
            arrya[arrya.length- 1] = 0;

            }
        }}
 
 


        Random random = new Random();//Вывести неповторяющиеся элементы массива
        int[] array = new int[10];
        int[] array1 = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j & array[i] == array[j]) {
                    array1[i]++;
                    if (index < array1[j]) {
                        index = j;
                    }
                }
            }
            if (array1[i] == 0) {
                System.out.print(array[i] + " ");
            }
        }
        }}  


      
        Random random = new Random();//Реверс массива
        int[] array = new int[10];
        int[] array2= new int [10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10 + 5) - 5;
        }
        for (int u = 0; u < 10; u++) {
            array2 [u] = array[(array.length-1)-u];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

    }}

     /*  Random random = new Random();//Сумма четных положительных элементов массива
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10 + 5) - 5;
            if (array[i] > 0) {
                if (array[i] % 2 == 0) {
                    sum = sum + array[i];
                }
            }

        }

        System.out.println(Arrays.toString(array));
        System.out.println("\n Cумма чётных положительных чисел =  " + sum);


    }}


     
