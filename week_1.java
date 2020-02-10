/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vananhnt
 */
public class week_1 {
    public static void main(String[] args){
        boolean xAndY = Double.parseDouble(args[0]) == Double.parseDouble(args[1]);
        boolean yAndZ = Double.parseDouble(args[1]) == Double.parseDouble(args[2]);
        System.out.println(xAndY && yAndZ);
    }
}
