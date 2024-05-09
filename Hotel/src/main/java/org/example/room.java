package org.example;

public class room {
    private String name;
    private int capacity;
    private boolean isOccupied;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public room(String name, int capacity, boolean isOccupied){
        this.name = name;
        this.capacity = capacity;
        this.isOccupied =isOccupied;
    }
}
