package com.company;

import java.io.IOException;

public class ClassWork7 {

    public static void main(String[]args){
        int[] array= new int[]{3,2,2,1,7};
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum = sum + array[i];

        }
        try{
            if ( sum>10)

            throw new MyException("Сумма  не может быть больше 10 ");


        }catch (MyException ex){
            System.out.println(ex.getMessage());

        }finally {

            System.out.println(" пробуй меньше >"+sum);

        }

    }
}
