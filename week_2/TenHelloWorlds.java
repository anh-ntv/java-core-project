/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_2;

/**
 *
 * @author vananh
 */
public class TenHelloWorlds {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[1]);
        print_helloworld(n);
    }
    
    public static void print_helloworld(int n) {
        for(int i = 0; i<n ; i++){
            System.out.println("Hello world");
        }
    }
}
