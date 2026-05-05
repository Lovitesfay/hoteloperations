package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numOfStay;
    private boolean isWeekend;

    public Reservation(String roomType, int numOfStay, boolean isWeekend) {
        this.roomType = roomType;
        this.numOfStay = numOfStay;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }


    public int getNumOfStay() {
        return numOfStay;
    }

    public void setNumOfStay(int numOfStay) {
        this.numOfStay = numOfStay;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice() {
        double basePrice;

        if (roomType.equals("king")) {
            basePrice = 139.00;
        } else if (roomType.equals("double")) {
            basePrice = 124.00;
        } else {
            basePrice = 0.0;
        }

        if (isWeekend) {
            basePrice *= 1.10;
        }

        return basePrice;
    }

    public double getReservationTotal() {
        return getPrice() * numOfStay;
    }
}