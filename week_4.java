
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author vananhnt
 */
public class week_4 {
    public static void main(String[] args) {
        int idx = Integer.parseInt(args[0]);
        switch (idx) {
            case 1:
                {   
                    String path_to_file = args[1];
                    sum_arr(path_to_file);
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
            case 5:
                {
                    String path_to_file = args[1];
                    hw_5(path_to_file);
                    break;
                }
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
    
    public static void sum_arr(String path_to_file){
        File file = new File(path_to_file); 
        try (Scanner sc = new Scanner(file)){
            int n = sc.nextInt();
            int[] a = read_int_arr(sc, n);
            int[] b = read_int_arr(sc, n);
            
            // compute array c
            int[] c = new int[n];
            for(int i = 0; i< n; i++){
                c[i] = a[i] + b[i];
            }
            // print all element in array c
            print_arr(c);
            
        }catch (FileNotFoundException ex) {
            System.err.println("File is not found, please check path to file");
        }
        
    } 
    
    public static boolean prime(int a){
        if(a <= 1){
            return false;
        }
        
        // check if a % a[i] == 0 then a is not prime
        for(int i = 2; i <= a/2; i++){
            if(a % i == 0){
                return false;
            }
        }
        
        return true;
    }
    
    public static void hw_2(String path_to_file){
        
        File file = new File(path_to_file); 
        try (Scanner sc = new Scanner(file)){
            int n = sc.nextInt();
            int[] a = read_int_arr(sc, n);
            
            get_list_prime(a);
            
        }catch (FileNotFoundException ex) {
            System.err.println("File is not found, please check path to file");
        }
    }
    
    public static void get_list_prime(int[] a){
        int num_prime = 0;
        int n = a.length;
        int[] prime_arr = new int[n];
            
        for(int i = 0; i< n; i++){
            if(prime(a[i])){
                prime_arr[num_prime] = a[i];
                num_prime += 1;
            }
        }
            
            System.out.println("Number of prime is " + num_prime);
            
            // print array of prime with index from 0 to num_prime
            print_arr(prime_arr, num_prime);
    }
    
    public static void hw_3(String path_to_file){
        File file = new File(path_to_file); 
        try (Scanner sc = new Scanner(file)){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = read_int_arr(sc, m, n);
            
            change_to_zero(a);
        }catch (FileNotFoundException ex) {
            System.err.println("File is not found, please check path to file");
        }
    }
    
    public static void change_to_zero(int[][] a){
        int m = a.length;
        int n = a[0].length;
        int MARK_VALUE = Integer.MAX_VALUE;

        //Change all element in row i and column j if a[i][j] is 0
        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(a[i][j] == 0){
                    for(int k = 0; k< m; k++){
                        if(a[k][j] != 0){
                            a[k][j] = MARK_VALUE;
                        }
                    }
                    for(int k = 0; k<n; k++){
                        if(a[i][k] != 0){
                            a[i][k] = MARK_VALUE;
                        }
                    }
                }
            }
        }

        //Change value in marked position to 0
        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(a[i][j] == MARK_VALUE){
                    a[i][j] = 0;
                }
            }
        }
        
        print_arr(a);
    }
    
    public static void hw_4(String path_to_file){
        File file = new File(path_to_file); 
        try (Scanner sc = new Scanner(file)){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = read_int_arr(sc, m, n);
            
            // spiral(a);
        }catch (FileNotFoundException ex) {
            System.err.println("File is not found, please check path to file");
        }
        
    } 
    
    public static boolean check_sudoku_row_column(int[][] a){
        boolean[][] check = new boolean[a.length][a[0].length];

        // check row and column
        for(int i = 0; i< a.length; i++){
            for(int j = 0; j< a[0].length; j++){
                int idx_tocheck = a[i][j] - 1;
                if(check[i][idx_tocheck]){
                    return false;
                }
                check[i][idx_tocheck] = true;

                if(check[idx_tocheck][j]){
                    return false;
                }
                check[idx_tocheck][j] = true;
            }
        }
        return true;
    }
    
    public static boolean check_sudoku_3x3_matrix(int[][] a){
        boolean[] check;
        int[] idx_check = {0, 3, 6};
        
        for(int i: idx_check){
            for(int j: idx_check){
                check = new boolean[a.length];
                // small matrix is matrix with row starting from i->i+2 and column starting from j->j+2
                for(int u = 0; u < 3; u++){
                    for(int v = 0; v < 3; v++){
                        int idx_tocheck = a[i+u][j+v] - 1;
                        if(check[idx_tocheck]){
                            return false;
                        }
                        
                        check[idx_tocheck] = true;
                    }
                }
            }
        }
        
        return true;
    }
    
    public static void check_sudoku(int[][] a){
        if(check_sudoku_row_column(a) && check_sudoku_3x3_matrix(a)){
            System.out.println("This is a sudoku answer");
        }else{
            System.out.println("This is not a sudoku answer");
        }
    }
    
    public static void hw_5(String path_to_file){
        File file = new File(path_to_file); 
        try (Scanner sc = new Scanner(file)){   
            int len_a = 9;
            int[][] a = read_int_arr(sc, len_a, len_a);
            
            check_sudoku(a);
        }catch (FileNotFoundException ex) {
            System.err.println("File is not found, please check path to file");
        }
        
    } 
}

