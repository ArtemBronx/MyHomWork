package com.company;

import java.util.*;

public class Persoona {

    int age;
    String name;

    public Persoona(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {

     Persoona artem = new Persoona (22, "Artem" );
    Persoona artem1 = new Persoona (22, "Artem" );
        System.out.println(artem.equals(artem1));
        Set set = new HashSet<>();
        set.add(artem);
        set.add(artem1);
        System.out.println(set.size());
        Map<String,String> map = new HashMap<>();
        map.put("12","max");
        map.put("123","kirill");

}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoona persoona = (Persoona) o;
        return age == persoona.age && Objects.equals(name, persoona.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
