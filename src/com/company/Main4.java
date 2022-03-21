package com.company;

public class Main4 {
    public void main(String[]args) {


        A a1 = new A();
        A a2 = new A();
        a1.b++;
        System.out.println(a1.b);
        System.out.println(a2.b);
        A.a+=1000000;
        System.out.println(A.a);

    }
}
