/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core_project.week_10;

import java.util.Scanner;

/**
 *
 * @author vananh
 */
public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber();
        ComplexNumber b = new ComplexNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Start input real and imaginary of 2 complex number respectly:");
   
        a.setReal(sc.nextDouble());
        a.setImaginary(sc.nextDouble());
        b.setReal(sc.nextDouble());
        b.setImaginary(sc.nextDouble());
        
        System.out.println("a + b = " + a.add(b).toString());
        System.out.println("a - b = " + a.subtract(b).toString());
        System.out.println("a * b = " + a.multiply(b).toString());
        System.out.println("a / b = " + a.devide(b).toString());
        
    }
}
