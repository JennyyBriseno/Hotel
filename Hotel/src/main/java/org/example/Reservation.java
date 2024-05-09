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
}
