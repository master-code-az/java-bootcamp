package com.mastercode.week04.inheritance.solution_private;

public class Programmer extends Person {
    private String companyName;

    public void code() {
        System.out.println("Coding");
    }


    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void learn() {
        super.learn();
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
