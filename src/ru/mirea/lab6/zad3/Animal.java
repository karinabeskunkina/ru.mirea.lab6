package ru.mirea.lab6.zad3;

public class Animal implements Nameable {

    @Override
    public String getName() {
        String className = this.getClass().getSimpleName();
        return className;
    }
}
