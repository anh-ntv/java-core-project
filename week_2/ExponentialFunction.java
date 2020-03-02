/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package week_2;

/**
 *
 * @author vananh
 */
public class ExponentialFunction {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        double ex = get_exp(x, n);
        System.out.println(ex);
    }
    
    public static double get_exp(double x, int n){
        double ex = 1.0 + x;
        for(int i = 2; i< n+ 1; i++){
            ex += get_element_i(x, i);
        }
        return ex;
    }
    
    public static double get_element_i(double x, int n){
        double ci = x;
        for(int i = 2; i <= n; i++){
            ci *= x;
            ci /= i;
        }
        return ci;
    }
}
