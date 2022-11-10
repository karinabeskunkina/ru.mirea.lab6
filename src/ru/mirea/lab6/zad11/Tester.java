package ru.mirea.lab6.zad11;

public class Tester {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(32);
        System.out.println(temperature);
        temperature.Convert("F");
        temperature.Convert("K");
    }
}
