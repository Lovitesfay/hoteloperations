package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
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

        if (roomType.equals("king")) {
            return 139.00;
        } else if (roomType.equals("double")) {
            return 124.00;
        } else {
            return price;
        }


    }

    public double getReservationTotal() {
        double total = this.getPrice() * this.numOfStay; * this.getPrice();

        if (this.isWeekend) {
            total = total + (total *.1);
        }
        return total;
    }
}