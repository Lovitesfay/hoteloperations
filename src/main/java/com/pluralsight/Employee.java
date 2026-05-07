package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchIn;
    private double punchOut;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        double regularPay = this.payRate * this.getRegularHours();
        double overTimePay = this.payRate * this.getOvertimeHours();

        return payRate * hoursWorked;
    }

    public double getRegularHours() {
        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        }
        return 40;
    }

    public double getOvertimeHours() {
        if (this.hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }

    public double punchIn(int time) {
        if (this.punchIn == 0) {
            punchIn = time;
        }
        return punchIn;

    }
    public double punchOut(int time) {
        if (this.punchIn != 0 && this.punchOut == 0) {
            this.punchOut = time;

            // calculate hours for this shift
            double hours = this.punchOut - this.punchIn;
            this.hoursWorked += hours;

            // reset for next shift
            this.punchIn = 0;
            this.punchOut = 0;
        }
        return punchOut;
    }
    public void punchTimeCard(int start, int endTime) {
        this.punchIn(start);
        this.punchOut(endTime);
    }
    public void punchIn(){
        LocalTime currentTime = LocalTime.now();
        int CurrentHour = currentTime.getHour();
        int CurrentMinute = currentTime.getMinute();
        this.punchIn(CurrentHour);
        this.punchOut(currentTime.getHour());


    }
    public void punchOut(){
        LocalTime currentTime = LocalTime.now();
        int CurrentHour = currentTime.getHour();
        int CurrentMinute = currentTime.getMinute();
        this.punchIn(CurrentHour);
        this.punchOut(CurrentMinute);

    }

}









