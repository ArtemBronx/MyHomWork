package com.company;

import java.util.Queue;

public class Human2 implements Doctor,Swimmable {
    String qender;

    @Override
    public void heak() {
        System.out.println(" Лечит ");

    }

    @Override
    public void swim() {
        System.out.println(" плввать ");


    }
}


