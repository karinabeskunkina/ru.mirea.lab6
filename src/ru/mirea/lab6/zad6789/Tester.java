package ru.mirea.lab6.zad6789;

public class Tester {
    public static void main(String[] args) {
        Printable[] printables = new Printable[2];
        printables[0] = new Book("Structure of reality", "David Deutsch");
        printables[1] = new Shop("Bazaar", "07.10.2022");
        for (Printable x: printables) {
            x.print();
        }

    }
}
