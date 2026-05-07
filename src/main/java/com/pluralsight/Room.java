package com.pluralsight;

public class Room {
   private int numOfBeds;
   private double price;
   private boolean isOccupied;
   private boolean isDirty;

    public Room(int numOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numOfBeds = numOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;

    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return !this.isOccupied && !this.isDirty;


    }
    public void checkIn() {
        if (!this.isOccupied() && !this.isDirty()) {
            isOccupied = true;
            isDirty  = true;
        }
    }
    public void checkOut() {
        isOccupied = false;
       isDirty = true;

    }
    public void cleanroom() {

        this.isDirty = false;

    }
}














