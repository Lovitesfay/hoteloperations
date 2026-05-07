package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_Mark_it_as_Dirty() {
        //arrange
        Room someRoom = new Room(2, 70.99, false,true);

        //act
        someRoom.checkIn();

        //assert
        assertTrue(someRoom.isDirty());

    }
    @Test
    public void checkIn_should_Mark_it_as_Occupied() {
        //arrange
        Room someRoom = new Room(2, 70.99, false,false);

        //act
        someRoom.checkIn();

        //assert
        assertTrue(someRoom.isOccupied());

    }
    @Test
    public void checkOut_should_return_true_When_Room_is_NotOccupied() {
        //arrange
        Room someRoom = new Room(2, 70.99, true,false);

        //act
        someRoom.checkOut();

        //assert
        assertTrue(someRoom.isOccupied());
    }
    @Test
    public void CleanRoom_should_return_true_WhenGuesthasCheckout() {
        //arrange
        Room someRoom = new Room(2, 70.99, false,true);

        //act
        someRoom.cleanroom();

        //assert
        assertFalse(someRoom.isDirty());
    }
@Test
    public void punchIn_Should_start_the_Timer() {
        //arrange
        Employee employee = new Employee(765, "Lovi", "Developer",25,30);

    //act
        employee.punchIn(8);
        employee.punchOut(12);

    //
    assertEquals(4,employee.getHoursWorked());
}
}