package ru.mirea.lab6.zad10;

public class Monitor {
    float diagonal;
    int brightness;
    int frequency;

    Monitor(float diagonal, int brightness, int frequency) {
        this.brightness = brightness;
        this.diagonal = diagonal;
        this.frequency = frequency;
    }

    public String toString() {
        return "Diagonal " + diagonal + "\nBrightness " + brightness + "\nFrequency " + this.frequency;
    }

}
