
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author vananhnt
 */
public class week_6 {
    public static void main(String[] args) {
        int idx = Integer.parseInt(args[0]);
        switch (idx) {
            case 1:
                {   
                    String path_to_file = args[1];
                    hw_1(path_to_file);
                    break;
                }
            case 2:
                {
                    String path_to_file = args[1];
                    hw_2(path_to_file);
                    break;
                }
            case 3:
                {
                    String path_to_file = args[1];
                    hw_3(path_to_file);
                    break;
                }
            case 4:
                {
                    String path_to_file = args[1];
                    hw_4(path_to_file);
                    break;
                }
//            case 5:
//                {
//                    String path_to_file = args[1];
//                    hw_5(path_to_file);
//                    break;
//                }
            default:    
                break;
        }
        
    }
    
    public static void print_arr(int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + "\t");
        }
    }
    
    public static void print_arr(int[] a){
        int n = a.length;
        print_arr(a, n);
    }
    
    public static void print_arr(double[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + "\t");
        }
    }
    
    public static void print_arr(double[] a){
        int n = a.length;
        print_arr(a, n);
    }
    
    public static void print_arr(int[][] a){
        int n = a.length;
        for(int i = 0 ; i < n; i++){
            print_arr(a[i]);
            System.out.println();
        }
    }
    
    public static int[] read_int_arr(Scanner sc, int n){
        int[] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }
        return a;
    }

    
    public static int[][] read_int_arr(Scanner sc, int m, int n){
        int[][] a = new int[m][n];
        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }
    
    public static void hw_1(String path_to_file){
        File file = new File(path_to_file); 
        try {
            Scanner sc = new Scanner(file);
            int n = sc.nextInt();
            int[] a = read_int_arr(sc, n);
            
            a = revert_matrix(a);
            print_arr(a);
            sc.close();
        } catch (IOException ex) {
            System.out.println("Please check path to file or format of file");
        }
    }
    
    public static int[] revert_matrix(int[] a){
        int n = a.length;
        for(int i = 0; i < n / 2; i++){
            int k = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = k;
        }
        return a;
                
    }
    
    public static void hw_2(String path_to_file){
        File file = new File(path_to_file); 
        try {
            Scanner sc = new Scanner(file);
            int n = sc.nextInt();
            int[] a = read_int_arr(sc, n);
            
            get_longest_arr(a);
            
            sc.close();
        } catch (IOException ex) {
            System.out.println("Please check path to file or format of file");
        }
    }
    
    public static void get_longest_arr(int[] a){
        int checked = a[0];
        int max_len = 1;
        
        int checking = a[0];
        int len = 0;
        for(int i = 0; i < a.length; i++){
            if (a[i] == checking){
                len++;
            }else{
                if (len > max_len){
                    max_len = len;
                    checked = checking;
                }
                
                len = 1;
                checking = a[i];
            }
        }
        System.out.println(max_len);
        System.out.println(checked);
    }
    
    public static void hw_3(String path_to_file){
        File file = new File(path_to_file); 
        try (Scanner sc = new Scanner(file)){
            
            String s = sc.useDelimiter("\\A").next();
            int num_word = WordCount(s);
            System.out.println(num_word);
            
        }catch (FileNotFoundException ex) {
            System.err.println("File is not found, please check path to file");
        }
    }
    
    public static int WordCount(String s){
        int len_word = 0;
        if(s.length() > 0){
            len_word = 1;
            for (int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if (c == ' '){
                    len_word += 1;
                }
            }
        }
        
        return len_word;
    }
    
    public static void hw_4(String path_to_file){
        File file = new File(path_to_file); 
        try (Scanner sc = new Scanner(file)){
            
            int n = sc.nextInt();
            MagicSquare(n);
            
        }catch (FileNotFoundException ex) {
            System.err.println("File is not found, please check path to file");
        }
    }
    
    public static void MagicSquare(int n){
        int[][] a = new int[n][n];
        int next_i = n-1;
        int next_j = n / 2;
        for (int i = 1; i <= n*n; i++){
            a[next_i][next_j] = i;
            next_i = next_i + 1;
            next_j = next_j + 1;
            
            // Check if next position is valid
            if ((next_i == n && next_j == n) || a[next_i%n][next_j%n] != 0){
                next_i = next_i - 2;
                next_j = next_j - 1;
            }
            
            next_i = next_i % n;
            next_j = next_j % n;
        }
        
        print_arr(a);
    }
}

