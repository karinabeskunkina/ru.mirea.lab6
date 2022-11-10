package ru.mirea.lab6.zad4;

public class Product implements Priceable {
    String title;
    int price;

    Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public String toString() {
        return "Продукт " + title + "\nЦена " + getPrice();
    }
}
