/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_1;

/**
 *
 * @author vananh
 */
public class Divisibility {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        
        boolean isDivisable = (x % 7 == 0)&&(y%7==0);
        System.out.println(isDivisable);
    }
}
