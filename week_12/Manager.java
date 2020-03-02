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
public class Manager extends Employee {

    public Manager(String id, String name, int birthYear, double basicSalary) {
        super(id, name, birthYear, basicSalary);
    }

    @Override
    public double getBasicSalary() {
        return super.getBasicSalary() * 1.25;
    }
    
    @Override
    public String toString() {
        return "Manager{" + "\nid=" + this.getId() + "\nname=" + this.getName() + "\nbirthYear=" + this.getBirthYear() + "\nbasicSalary=" + this.getBasicSalary() + "\n}";
    }
}
