package ru.mirea.lab6.zad6789;

public class Shop implements Printable {

    String name;
    String data;

    Shop(String name, String data) {
        this.name = name;
        this.data = data;
    }


    @Override
    public void print() {
        System.out.println("Журнал " + name + "\nДата выпуска " + data + "\n");
    }
}
