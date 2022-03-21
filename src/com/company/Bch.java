package com.company;

import java.util.Random;
import java.util.Scanner;

public class Bch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rd = new Random();

        int childCount = sc.nextInt();

        Child[] children = new Child[childCount];
        for (int i = 0; i < children.length; i++) {
            children[i] = new Child(generateRandomString(3), rd.nextInt(50), rd.nextBoolean());


        }

    }




   public static String generateRandomString(int n){
        Random rd = new Random();

       String[]array={"Ftyz  "," freef ", "ewrewrw" };
        String result = " ";

       for (int i = 0; i < n ; i++) {
           result += array[rd.nextInt(array.length)];

       }
       return  result;


}
}