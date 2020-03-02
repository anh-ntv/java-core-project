package week_1;

public class CheckEqual {
    public static void main(String[] args){
        boolean xAndY = Double.parseDouble(args[0]) == Double.parseDouble(args[1]);
        boolean yAndZ = Double.parseDouble(args[1]) == Double.parseDouble(args[2]);
        System.out.println(xAndY && yAndZ);
    }
}