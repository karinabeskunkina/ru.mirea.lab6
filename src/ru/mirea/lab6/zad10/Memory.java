package ru.mirea.lab6.zad10;

public class Memory {
    int memoryReadOnly;
    int memoryReadRecord;
    int speed;

    Memory(int memoryReadOnly, int memoryReadRecord, int speed) {
        this.memoryReadOnly = memoryReadOnly;
        this.memoryReadRecord = memoryReadRecord;
        this.speed = speed;
    }


    public String toString() {
        return "Memory read only " + memoryReadOnly + "\nMemory read-record " + memoryReadRecord + "\nSpeed " + speed;
    }

}
