package org.example;

import org.w3c.dom.ls.LSOutput;

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
    //main method for testing
    public static void main(String[] arg){
        room room1 = new room(2, 100.0, false, false);
        System.out.println("Number of Beds: " + room1.getNumberOfBeds());
        System.out.println("Price: $" + room1.getPrice());
        System.out.println("Occupied: " + room1.isOccupied());
        System.out.println("Dirty: " + room1.isDirty());
        System.out.println("Available: " + room1.isAvailable());
    }
}
