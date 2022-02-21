package com.company;

import java.util.Arrays;
import java.util.Random;

public class ClassWork6 {
    public static void main(String[] args) {
        System.out.println( generateRandomString(5));
        System.out.println( generateRandomStringAl(5));


    }

    public static String generateRandomString(int n) {
        Random random = new Random();
        char[] array = new char[n];

        for (int i = 0; i < n; i++) {
            array[i] = (char) random.nextInt(255);
        }
        return  Arrays.toString(array);
    }

    public static String generateRandomStringAl(int n) {
        Random random= new Random();
        String []array = {"A","B","C","D","E"};
        String result = "";
        for (int i = 0; i <n ; i++) {
            result += array[random.nextInt(array.length)];

        }
        return result;
    }
}