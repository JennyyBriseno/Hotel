package org.example;

public class Reservation {
    //properties
    private String roomType;
    private double roomPrice;
    private int nightsStayed;
    private boolean isWeekend;
    private double reservationTotal;

    //constructor
    public Reservation(String roomType, double roomPrice, int nightsStayed, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.nightsStayed = nightsStayed;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }
    public Reservation(String roomType, int nightsStayed, boolean isWeekend) {
        this.roomType = roomType;
        this.nightsStayed = nightsStayed;
        this.isWeekend = isWeekend;
    }

    //Getters and Setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public int getNightsStayed() {
        return nightsStayed;
    }

    public void setNightsStayed(int nightsStayed) {
        this.nightsStayed = nightsStayed;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    //methods

    public double setRoomPrice(String roomType) {
        if(roomType.equals("double")){
            this.roomPrice = 124;
        } else if (roomType.equals("king")){
            this.roomPrice = 139;
        }
        return this.roomPrice;

    }

    public double calculateReservationTotal(){
        if(isWeekend){
            reservationTotal = setRoomPrice(roomType) * nightsStayed * .10;
            return reservationTotal;
        }
        else {
            reservationTotal = setRoomPrice(roomType) * nightsStayed;
            return reservationTotal;
        }
    }
}
