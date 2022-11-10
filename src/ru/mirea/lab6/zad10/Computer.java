package ru.mirea.lab6.zad10;

import java.util.Scanner;

public class Computer {
    Stamp log;
    String model;
    int price;
    Memory memory;
    Monitor monitor;
    Processor processor;

    Computer() {
        //pus
    }

    Computer(Stamp log,String model, int price, Memory memory, Monitor monitor, Processor processor) {
        this.log = log;
        this.model = model;
        this.price = price;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    public String toString() {
        return "Logo: " + log + "\nPrice " + price + "\nMemory : \n"
                + memory + "\nMonitor : \n" + monitor + "\nProcessor : \n" + processor;
    }

}
