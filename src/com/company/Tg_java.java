package com.company;


import java.io.IOException;

public class Tg_java {

    //  final  // это  Константа :  при таком  теги  значение  больше не меняется
//пример
    //public final int constantaPrimer = 55 ;


// мини игра  угодай  букву
    public static void main (String[] args ) throws IOException {

        /*char ch, answer = 'B';
        System.out.println(" Какую буквы я загодал ? ");
        System.out.print("попытайтесь ее угодать ");

        ch = (char) System.in.read();

        if (ch == answer) {
            System.out.println("поздровляю");
        } else if (ch > answer) {
            System.out.println( " перестарался ");}
            else {
            System.out.println( " loss " );
            }*/

        // 2  Программа  Switch кейс блоковая
        int monht = 1;

            String monhtString = "1" ;
        System.out.println(monhtString);

        switch (monht) {
            case 1:
                monhtString = "Январь";
                break;
            case 2:
                monhtString = "Февраль";
                break;
            case 3:
                monhtString = "Март";
                break;
            case 4:
                monhtString = "Апрель";
                break;
            case 5:
                monhtString = "Май";
                break;
            case 6:
                monhtString = "Июнь";
                break;
            case 7:
                monhtString = "Июль";
                break;
            case 8:
                monhtString = "Август";
                break;
            case 9:
                monhtString = "Сентябрь";
                break;
            case 10:
                monhtString = "Октябрь";
                break;
            case 11:
                monhtString = "Ноябрь";
                break;
            case 12:
                monhtString = "Декабрь";
                break;

            case 13:
                monhtString = "нет такого  месяца";


                break;
        }}}

/*
        }

    }



        }


        //if // если
// else или
*/


