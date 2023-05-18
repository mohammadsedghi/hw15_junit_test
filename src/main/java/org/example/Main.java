package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(convert("abc"));
    }

    public static String convert(String number) {
        try {
            int num = Integer.parseInt(number);
            if (num > -32768 && num < 32767) return "ok";
        } catch (NumberFormatException e) {
           throw new NumberFormatException("number format exception") ;
        }
        return "no";
    }
}