package com.mastercode.week04.inheritance.challenge;

public class SalariedEmployee extends Employee {
    public double annualSalary;
    public boolean isRetired;

    public void retie() {
        if (!isRetired) {
            System.out.println("Employee already retired");
        }
        isRetired = true;
    }


    @Override
    public double collectPay() {
        int hiredDateYear = hiredDate.getYear();
        int endDateYear = endDate.getYear();
        int workedYear = endDateYear - hiredDateYear;

        return workedYear * annualSalary;
    }
}
