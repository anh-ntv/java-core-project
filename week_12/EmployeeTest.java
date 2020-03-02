/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package java_core_project.week_12;

import java.util.ArrayList;

/**
 *
 * @author vananh
 */
public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<Employee> e_list = new ArrayList<>();
        
        for(int i = 0; i< 10; i++){
            Employee e;
            String id = "e" + i;
            String name = "Empl name " + i;
            int bY = i;
            int sal = 2000;
            int nP = 4;
            switch (i%4) {
                case 0:
                    e = new Employee(id, name, bY, sal);
                    break;
                case 1:
                    e = new Manager(id, name, bY, sal);
                    break;
                case 2:
                    e = new DataScientist(id, name, bY, sal, nP);
                    break;
                default:
                    e = new Developer(id, name, bY, sal, nP);
                    break;
            }
            e_list.add(e);
        }
        
        for(Employee e: e_list){
            System.out.println(e.toString());
        }
    }
}
