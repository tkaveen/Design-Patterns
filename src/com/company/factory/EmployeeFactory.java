package com.company.factory;

public class EmployeeFactory {
    public Employee getInstance(String type, String name,int hoursWorked,double rate){

        Employee employee=null;

        if(type.equals("hourly")){
            employee = new HourlyEmployee("1",name, hoursWorked, rate );
        }

        else if(type.equals("monthly")){
            employee = new MonthlyEmployee("2", name, rate);
        }
        else if(type.equals("daily")){
//            Employee employee = new MonthlyEmployee("2", name, rate);
//            System.out.println("Salary of Kamal is :" + employee.calsSalary());
        }
        else if(type.equals("contract")){
            return new ContractBasisEmployee("5", name, rate);
        }
        return employee;
    }
}
