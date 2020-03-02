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
public class Developer extends Employee{
    private int numberProject;
    
    public Developer(String id, String name, int birthYear, double basicSalary, int numberProject) {
        super(id, name, birthYear, basicSalary);
        this.numberProject = numberProject;
    }

    public int getNumberProject() {
        return numberProject;
    }

    public void setNumberProject(int numberProject) {
        this.numberProject = numberProject;
    }
    

    @Override
    public String toString() {
        return "Developer{" + "\nid=" + this.getId() + "\nname=" + this.getName() + "\nbirthYear=" + this.getBirthYear() + "\nbasicSalary=" + this.getBasicSalary() + "\nNumberProject=" + this.getNumberProject() + "\n}";
    }
}
