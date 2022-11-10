package ru.mirea.lab6.zad2;


public class Tester {
    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(3, 3,10, 0, 15, 5);
        movableRectangle.moveUp();
        movableRectangle.moveRight();
        System.out.println(movableRectangle);
    }
}
