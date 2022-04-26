package com.company;

public class Main5  {
    public static void main(String[] args) {
        Converter converter = new BaseConverter( );

        System.out.println(converter.convert(23, 'k'));
        System.out.println(converter.convert(23,'f'));
    }
}
