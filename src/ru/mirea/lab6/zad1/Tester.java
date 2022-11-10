package ru.mirea.lab6.zad1;

public class Tester {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3, 4, 1, 3);
        movablePoint.moveUp();
        movablePoint.moveRight();
        System.out.println(movablePoint);
        MovableCircle movableCircle = new MovableCircle(5, 4, 1, 8, 15);
        movableCircle.moveDown();
        movableCircle.moveLeft();
        System.out.println(movableCircle);
    }
}
