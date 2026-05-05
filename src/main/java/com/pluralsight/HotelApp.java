package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        Room room1 = new Room(2, 65.50, true, false);
        Room room2 = new Room(1, 80.3, false, true);
        Room room3 = new Room(2, 65.5, true, true);
        Room room4 = new Room(1, 80, false, false);

        System.out.println("[room1]");
        System.out.println("Beds: " + " " + room1.getNumOfBeds());
        System.out.println("Price: " + " " + room1.getPrice());
        System.out.println("Occupancy: " + " " + room1.isOccupied());
        System.out.println("Dirty: " + " " + room1.isDirty());
        System.out.println("Availability:" + " " + room1.isAvailable());
        System.out.println(room1.checkIn());
        System.out.println(room1.checkOut());
        System.out.println(room1.cleanroom());
        System.out.println("[room2]");
        System.out.println("Beds: " + " " + room2.getNumOfBeds());
        System.out.println("Price: " + " " + room2.getPrice());
        System.out.println("Occupancy: " + room2.isOccupied());
        System.out.println("Dirty: " + " " + room2.isDirty());
        System.out.println("Availability:" + " " + room2.isAvailable());
        System.out.println();
        System.out.println("[room3]");
        System.out.println("Beds: " + room3.getNumOfBeds());
        System.out.println("Price: " + room3.getPrice());
        System.out.println("Occupancy: " + room3.isOccupied());
        System.out.println("Dirty: " + room3.isDirty());
        System.out.println("Availability:" + " " + room3.isAvailable());
        System.out.println("Beds: " + " " + room4.getNumOfBeds());
        System.out.println("Price: " + " " + room4.getPrice());
        System.out.println("Occupancy: " + " " + room4.isOccupied());
        System.out.println("Dirty: " + " " + room4.isDirty());
        System.out.println("Availability:" + " " + room4.isAvailable());
        System.out.println("---------------------------------------------");


        Employee time = new Employee(332, "lovi", "Developer",30,0);

        System.out.println("Work time ");
        System.out.println("ID: " + time.getEmployeeId());
        time.punchOut(14);

        time.punchIn(15);
        time.punchOut(18);


        System.out.println("Hours worked: " + time.getHoursWorked()); // 7
    }
    }





