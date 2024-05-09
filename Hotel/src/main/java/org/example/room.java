package org.example;

public class room {
    private boolean isDirty;
    private double price;
    private boolean isAvailable;
    private int numberOfBeds;

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public room(boolean isDirty, double price, boolean isAvailable, int numberOfBeds){
        this.isDirty = isDirty;
        this.isAvailable =isAvailable;
        this.numberOfBeds =numberOfBeds;
        this.price = price;
    }


}
