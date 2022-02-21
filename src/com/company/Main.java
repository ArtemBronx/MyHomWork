package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("переменных");// каждое  значение  имеет свои  BITS !!
            int a = 3; // 32 bits
               System.out.println(a);
                    short b = 4; // 16 bits
                      System.out.println(b);
                           long c = 5; // 64 bits
                             System.out.println(c);
                                  boolean t = true; // 1 bits
                                    System.out.println(t);

                                         char d = '\u2122'; // 16 bits использовать юни код

                                    System.out.println(d);
                                  double e = 6.5d; // 64 bits
                              System.out.println(e);
                           float i = 7.6f;// 32 bits
                      System.out.println(i);
                    byte o = 8;// 8 bits
               System.out.println(o);
        System.out.println(a + b + c + d + e + i + o); // простое сложение всех знаменателей


        System.out.println(" арифметические операции +, -, /, *, &,=,++,--");

                       int num0 = 2;
                       int num1 = 3;
                       int num10 = num0 + 5; // 7
        System.out.println("сложения 2+3 = " + (num0 + num1));

                       double num2 = 6.5d;
                       double num3 = 5.5d;
                       double num23 = num2 - 3 ; // 3.5
        System.out.println("вычетание 6.5-5.5 =" + (num2 - num3));

                       float num4 = 127.0f;
                       float num5 = 20.0f;
                       double num45 = num4 / 5 ; // 8.6
        System.out.println("деление 127/20 =" + (num4 / num5));

                        short num6 = 6;
                        short num7 = 20;
                        int num67 = num6 * 6 ; //36
        System.out.println("умножения 6 * 20 =" +(num6 * num7 ));

                         byte num8 = 34;
                         byte num9 = 7;
                         double num89 = num8 & num9;
                         int num98 = 22 & 4 ; // 2 пример ( 22  - 4*5= 2 )
        System.out.println("остаток от деления 34 & 7 = " +(num89));

        // пример  Инкремент++  и  Декремент --

        int x = 20, z = 20 ;
        x ++;
        z --;
        System.out.println("x:" + x +",z:" + z );

        /* Есть еще 2 формы Prefix и Postfix
        ++ -- Prefix , Описывает перед  переменной
        Postfix ++ -- , Описывает после  переменной
        Если они  работают  одинаково  занчит они не  в примере  вычисления
         */
         //1 пример  если  не использовать  в вычислении
        System.out.println( "Kак видно к числам  прибавилось  + 1 ");
        int m1 = 20 , v1 = 20 ;

        m1 ++;
        ++ v1;
        System.out.println("m1:"+ m1 + ",v1:"+ v1 );

        // 2 пример если использовать  в  вычислении
        System.out.println(" в этом примере  видно  где  отнялось  и куда прибавилось 1 ед.");
        int m2 = 20 , v2 = 20 ;
        final int h = 30 - m2++ ;
        final int g = 30 - ++ v2 ;
        System.out.println("h:" + h + ",g:"+ g );
        /* полное  описание  работы  Постфиксная форма:
        M2 = 20 начало  уравнения
        h = 30 - M2 c сначала производим вычитание  ( м2 все еще 20)
        М2 + = 1; увеличение на 1

        Префиксная же сработает так
         V2 20 ; Начало  уравнения
         v2 + = 1 : производит увелечение  на  1
         g = 30 - v2; а после  уже отнимает ( тока v2 УЖЕ 21 )
         */

        int red = 5;
        int white = 5 ;



        if ( red == white ){
            System.out.println(" результат равно ");

        } else {
            System.out.println(" результат не равно ");
        }



























    }
}
