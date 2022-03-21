package com.company;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        int n = 100;

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integers.add((int) (Math.random() * n));

        }
        double avr = 0;
        int sum = 0;
        for (int i = 0; i < integers.size(); i++) {
           //sum += integers.get(i);

            // avr = sum/n;

            if (integers.size() % 2 == 0) {
                avr++;
            } else {
                sum++;
            }
            System.out.println("avr" + avr + "sum" + sum);
        }
    }
}

