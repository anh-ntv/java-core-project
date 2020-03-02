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
public class Stats5 {
    public static void main(String[] args) {
        int n = 5;
        double[] a = getRandomArray(n);
        System.out.println(getAverageArray(a));
        System.out.println(getMaxArray(a));
        System.out.println(getMinArray(a));
    }

    public static double[] getRandomArray(int n) {
        double[] a = new double[n];
        for(int i = 0; i< n; i++){
            a[i] = Math.random();
        }
        return a;
    }
    
    public static double getMinArray(double[] a){
        double minArr = a[0];
        for(int i = 0; i< a.length; i++){
            minArr = Math.min(minArr, a[i]);
        }
        return minArr;
    }
    
    public static double getMaxArray(double[] a){
        double maxArr = a[0];
        for(int i = 0; i< a.length; i++){
            maxArr = Math.max(maxArr, a[i]);
        }
        return maxArr;
    }
    
    public static double getAverageArray(double[] a){
        double sum = 0;
        for(int i = 0; i< a.length; i++){
            sum += a[i];
        }
        return sum / a.length;
    }
    
}
