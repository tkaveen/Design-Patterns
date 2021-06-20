package com.company.factory;

public class DailyEmployee extends Employee{
    int daysWorked;
    double rate;

    @Override
    public double calsSalary() {
        return daysWorked* rate;
    }
}
