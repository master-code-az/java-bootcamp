package com.mastercode.week04.inheritance.challenge;

public class HourlyEmployee extends Employee {
    public double hourlyPayRate;


    public void getDoublePay() {
        double doublePay = hourlyPayRate * 2;
        System.out.println("Double pay " + doublePay);
    }
}
