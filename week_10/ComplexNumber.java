/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_core_project.week_10;

/**
 *
 * @author vananh
 */
public class ComplexNumber {
    
    private double real;
    private double imag;
    
    public ComplexNumber() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public ComplexNumber(double x, double y) {
        this.real = x;
        this.imag = y;
    }
    
    public double getReal() {
        return real;
    }

    public void setReal(double x) {
        this.real = x;
    }

    public double getImaginary() {
        return imag;
    }

    public void setImaginary(double y) {
        this.imag = y;
    }

    @Override
    public String toString() {
        String s;
        if(imag > 0){
            s = "+";
        }else{
            s = "";
        }
        return real + s + imag + 'i';
    }
    
    public ComplexNumber add(ComplexNumber other){
        return new ComplexNumber(
                this.real + other.real,
                this.imag + other.imag);
    }
    
    public ComplexNumber subtract(ComplexNumber other){
        return new ComplexNumber(
                this.real - other.real,
                this.imag - other.imag);
    }
    
    public ComplexNumber multiply(ComplexNumber other){
        return new ComplexNumber(
                this.real * other.real - this.imag * other.imag,
                this.real*other.imag + this.imag*other.real);
    }
    
    public ComplexNumber devide(ComplexNumber other){
        double a = this.real;
        double b = this.imag;
        double x = other.real;
        double y = other.imag;
        return new ComplexNumber((a*x + b*y) / (x*x + y*y),
                                (b*x - a*y) / (x*x + y*y));
    }
    
    
    
}
