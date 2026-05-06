package com.pluralsight;

public class Hotel {
    private String Name;
    private int numOfSuites;
    private int numOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numOfSuites, int numOfRooms) {
        Name = name;
        this.numOfSuites = numOfSuites;
        this.numOfRooms = numOfRooms;
    }

    public Hotel(String name, int numOfSuites, int numOfRooms, int bookedSuites, int bookedBasicRooms) {
        Name = name;
        this.numOfSuites = numOfSuites;
        this.numOfRooms = numOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumOfSuites() {
        return numOfSuites;
    }

    public void setNumOfSuites(int numOfSuites) {
        this.numOfSuites = numOfSuites;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public void setBookedSuites(int bookedSuites) {
        this.bookedSuites = bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public void setBookedBasicRooms(int bookedBasicRooms) {
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
    if (bookRoom(numberOfRooms, isSuite)) {
      if  (bookedBasicRooms + bookedSuites < numberOfRooms)
          return true;
        }
        return false;
    }
    public int getAvailableSuites() {
        return numOfSuites - bookedSuites;

    }
    public int getAvailableRooms() {
        return numOfRooms - bookedBasicRooms;


    }
}


