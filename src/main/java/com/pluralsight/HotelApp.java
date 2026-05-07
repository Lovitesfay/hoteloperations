package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        // HOTEL
        Hotel hotel = new Hotel("Hilton", 20, 50);

        System.out.println("Hotel: " + hotel.getName());
        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());

        System.out.println("--------------------------------");

        // ROOM
        Room room = new Room(2, 150.00, false, false);

        System.out.println("Room Available: " + room.isAvailable());

        room.checkIn();

        System.out.println("Guest checked in");
        System.out.println("Room Occupied: " + room.isOccupied());

        System.out.println("--------------------------------");

        // RESERVATION
        Reservation reservation = new Reservation("king", 3, true);

        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Price Per Night: " + reservation.getPrice());
        System.out.println("Reservation Total: " + reservation.getReservationTotal());

        System.out.println("--------------------------------");

        // EMPLOYEE
        Employee employee = new Employee(101, "Lovi", "Front Desk", 25, 0);

        employee.punchIn(9);
        employee.punchOut(17);

        System.out.println("Employee: " + employee.getName());
        System.out.println("Hours Worked: " + employee.getHoursWorked());

        System.out.println("--------------------------------");

        // CHECKOUT
        room.checkOut();

        System.out.println("Guest checked out");
        System.out.println("Room Dirty: " + room.isDirty());

        room.cleanroom();

        System.out.println("Room cleaned");
        System.out.println("Room Dirty: " + room.isDirty());
        System.out.println("Room Available: " + room.isAvailable());
    }
}





