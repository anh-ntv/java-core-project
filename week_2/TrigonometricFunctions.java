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
public class TrigonometricFunctions {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double e = Double.parseDouble(args[1]);
        System.out.println(get_sin(x, e));
        System.out.println(get_cos(x, e));
    }
    
    
    
    public static double get_sin(double x, double e){
        double sin_x = x;
        int i = 3;
        while(true){
            double el_i = get_element_i(x, i);
            if(el_i < e){
                break;
            }
            if (i%2 == 1){ 
                sin_x -= el_i;
            }else{
                sin_x += el_i;
            }
            i++;
        }
        return sin_x;
    }
    
    public static double get_cos(double x, double e){
        double cos_x = 1.0;
        int i = 2;
        while(true){
            double el_i = get_element_i(x, i);
            if(el_i < e){
                break;
            }
            if (i%2 == 1){ 
                cos_x += el_i;
            }else{
                cos_x -= el_i;
            }
            i++;
        }
        return cos_x;
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
