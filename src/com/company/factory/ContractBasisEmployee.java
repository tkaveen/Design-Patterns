package com.company.factory;

public class ContractBasisEmployee extends Employee {
    double rate;
    public ContractBasisEmployee(String id, String name , double rate){
        this.name= name;
        this.id = id;
        this.rate = rate;
    }

    @Override
    public double calsSalary() {
        return rate- rate*0.05;
    }
}
