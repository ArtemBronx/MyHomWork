package com.company;

public class Train implements Comparable<Train> {
    private String stringPoint;
    private  String name ;

    public Train(String stringPoint, String name) {
        this.stringPoint = stringPoint;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Train{" +
                "stringPoint='" + stringPoint + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getStringPoint() {
        return stringPoint;
    }

    public void setStringPoint(String stringPoint) {
        this.stringPoint = stringPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

}

    @Override
    public int compareTo(Train o) { // сортировка
        return this.name.compareTo(o.name);
    }
}
