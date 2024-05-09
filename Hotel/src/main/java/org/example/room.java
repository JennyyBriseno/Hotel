package org.example;

public class room {
    private int numberOfBeds;
    private double price;
    private boolean Occupied;
    private boolean dirty;

    //Constructor
    public room(int numberOfBeds, double price, boolean occupied, boolean dirty){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.Occupied = occupied;
        this.dirty = dirty;
    }
     public int getNumberOfBeds(){
        return numberOfBeds;
     }
     public void setNumberOfBeds(int numberOfBeds){
        this.numberOfBeds = numberOfBeds;
     }
     public double getPrice(){
        return price;
     }
     public void setPrice(double price){
        this.price = price;
     }
     public boolean isOccupied(){
        return Occupied;
     }
     public void setOccupied(boolean occupied){
        this.Occupied = occupied;
     }
     public boolean isDirty(){
        return dirty;
     }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
    public boolean isAvailable(){
        return ! Occupied && ! dirty;
    }
}
