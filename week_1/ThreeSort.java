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
public class ThreeSort {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        
        int minXY = Math.min(x, y);
        int maxXY = Math.max(x, y);
        int minXYZ = Math.min(minXY, z);
        int maxXYZ = Math.max(maxXY, z);
        int middleXYZ = x + y + z - minXYZ - maxXYZ;
        System.out.println(minXYZ);
        System.out.println(maxXYZ);
        System.out.println(middleXYZ);
    }
}
