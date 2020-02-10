/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vananhnt
 */
public class week_2 {
    public static void main(String[] args) {
        int idx = Integer.parseInt(args[0]);
        switch (idx) {
            case 1:
                double x1 = Double.parseDouble(args[1]);
                double y1 = Double.parseDouble(args[2]);
                System.out.println(euclide_distance(x1, y1, 0, 0));
                break;
            case 2:
                {
                    int n = Integer.parseInt(args[1]);
                    print_helloworld(n);
                    break;
                }
            case 3:
                {
                    double x = Double.parseDouble(args[1]);
                    int n = Integer.parseInt(args[2]);
                    double ex = get_exp(x, n);
                    System.out.println(ex);
                }
            case 4:
                {
                    double x = Double.parseDouble(args[1]);
                    double e = Double.parseDouble(args[2]);
                    System.out.println(get_sin(x, e));
                    System.out.println(get_cos(x, e));
                    break;
                }
            case 5:
                {
                    double t = Double.parseDouble(args[1]);
                    double v = Double.parseDouble(args[2]);
                    System.out.println(get_windchill(t, v));
                    break;
                }
            case 6:
                {
                    int m = Integer.parseInt(args[1]);
                    int d = Integer.parseInt(args[2]);
                    int y = Integer.parseInt(args[3]);
                    
                    System.out.println(get_dayofweek(m, d, y));
                    break;
                }
            default:    
                break;
        }
        
    }
    
    /**
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static double euclide_distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }

    /**
     *
     * @param n: 
     */
    public static void print_helloworld(int n) {
        for(int i = 0; i<n ; i++){
            System.out.println("Hello world");
        }
    }
    
    public static double get_exp(double x, int n){
        double ex = 1.0 + x;
        for(int i = 2; i< n+ 1; i++){
//            ex += get_exponent(x, i) / get_factorial_value(i);
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
    
    public static double get_exponent(double x, int n){
        double expo = 1.0;
        for(int i = 0; i< n; i++){
            expo *= x;
        }
        return expo;
    }
    
    public static int get_factorial_value(int x){
        int factor = 1;
        for(int i = 2; i< x+1; i++){
            factor *= i;
        }
        return factor;
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
                System.out.println(el_i);
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
    
    public static double get_windchill(double t, double v){
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }
    
    public static int get_dayofweek(int m, int d, int y){
        int y0 = y - (14 - m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12*((14 - m)/12) - 2;
        int d0 = (d + x + 31*m0/12);
        d0 = d0%7;
        return d0;
    }
    
    
    
    
}

