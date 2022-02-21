package com.company;

import java.io.IOException;

public class HomWork1 {
    public static void main(String[] args) throws IOException {

        /*for (int i = 0; i < 5; i++) {
            System.out.println("Интеграция" + i);

        }*/

        /*for (int r = 0;(char)System.in.read()!='S'; r++){ // стоп будет  после  ведение  буквы "S"
            System.out.println("Интерация"+r);

        }*/

       /* int count = 0;

        while (count<10){
            System.out.println(count);
            count ++;
        }

        int red = 10;
                do {
                    System.out.println(red);
                    red++;
                }while (red<10);
    }*/

       /* int count = 0;
        while (count<15){
            System.out.println(count);
            count++;
            if(count==7) break;      // когда  нужно  провести проверку  до определенного числа
        }*/

        int count = 0;
        while (count<15){
            count++;
            if ((count%2) !=0 ) continue;// схема  четных чисел
            System.out.println(count); //

        }

}}



// Прочитать про Git