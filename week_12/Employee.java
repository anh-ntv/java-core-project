/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package java_core_project.week_12;

/**
 *
 * @author vananh
 */
public class Employee {
    private String id;
    private String name;
    private int birthYear;
    private double basicSalary;

    public Employee() {
    }
    
    public Employee(String id, String name, int birthYear, double basicSalary) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.basicSalary = basicSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Employee{" + "\nid=" + this.getId() + "\nname=" + this.getName() + "\nbirthYear=" + this.getBirthYear() + "\nbasicSalary=" + this.getBasicSalary() + "\n}";
    }
    
}
