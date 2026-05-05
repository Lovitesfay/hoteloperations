package com.pluralsight;

public class Room {
   private int numOfBeds;
   private double price;
   private boolean IsOccupied;
   private boolean isDirty;

    public Room(int numOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numOfBeds = numOfBeds;
        this.price = price;
        IsOccupied = isOccupied;
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
        return IsOccupied;
    }

    public void setOccupied(boolean occupied) {
        IsOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
         if (!this.isOccupied() && !this.isDirty()) {
            return true;

        }
        return false;
    }
}













