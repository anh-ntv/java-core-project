
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author vananhnt
 */
public class week_4 {
    public static void main(String[] args) {
        int idx = Integer.parseInt(args[0]);
        switch (idx) {
            case 1:
                String path_to_file = args[1];
                sum_arr(path_to_file);
//                double x1 = Double.parseDouble(args[1]);
//                double y1 = Double.parseDouble(args[2]);
//                System.out.println(euclide_distance(x1, y1, 0, 0));
                break;
//            case 2:
//                {
//                    int n = Integer.parseInt(args[1]);
//                    print_helloworld(n);
//                    break;
//                }
//            case 3:
//                {
//                    double x = Double.parseDouble(args[1]);
//                    int n = Integer.parseInt(args[2]);
//                    double ex = get_exp(x, n);
//                    System.out.println(ex);
//                }
//            case 4:
//                {
//                    double x = Double.parseDouble(args[1]);
//                    double e = Double.parseDouble(args[2]);
//                    System.out.println(get_sin(x, e));
//                    System.out.println(get_cos(x, e));
//                    break;
//                }
//            case 5:
//                {
//                    double t = Double.parseDouble(args[1]);
//                    double v = Double.parseDouble(args[2]);
//                    System.out.println(get_windchill(t, v));
//                    break;
//                }
//            case 6:
//                {
//                    int m = Integer.parseInt(args[1]);
//                    int d = Integer.parseInt(args[2]);
//                    int y = Integer.parseInt(args[3]);
//                    
//                    System.out.println(get_dayofweek(m, d, y));
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
    
    public static int[] read_int_arr(DataInputStream dis, int n){
        int[] a = new int[n];
        try {
            for(int i = 0; i< n; i++){
                    a[i] = dis.readInt();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return a;
    }

    
    public static int[][] read_int_arr(DataInputStream dis, int m, int n){
        int[][] a = new int[m][n];
        try {
            for(int i = 0; i< m; i++){
                for(int j = 0; j< n; j++){
                    a[i][j] = dis.readInt();
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return a;
    }
    
    public static void sum_arr(String path_to_file){
        try {
            FileInputStream fis;
            fis = new FileInputStream(path_to_file);
            DataInputStream dis = new DataInputStream(fis);
            int n = dis.readInt();
            int[] a = week_4.read_int_arr(dis, n);
            int[] b = week_4.read_int_arr(dis, n);
            
            // compute array c
            int[] c = new int[n];
            for(int i = 0; i< n; i++){
                c[i] = a[i] + b[i];
            }
            // print all element in array c
            print_arr(c);
            fis.close();
            dis.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("File is not found. Please check path to file");
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
    
    public static void get_prime(String path_to_file){
        try {
            FileInputStream fis;
            fis = new FileInputStream(path_to_file);
            DataInputStream dis = new DataInputStream(fis);
            int n = dis.readInt();
            int[] a = week_4.read_int_arr(dis, n);
            
            int num_prime = 0;
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
            
            fis.close();
            dis.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("File is not found. Please check path to file");
        }
    }
    
    public static void change_to_zero(String path_to_file){
        try {
            FileInputStream fis;
            fis = new FileInputStream(path_to_file);
            DataInputStream dis = new DataInputStream(fis);
            
            int m = dis.readInt();
            int n = dis.readInt();
            int[][] a = read_int_arr(dis, m, n);
            int MARK_VALUE = Integer.MAX_VALUE;
            
            //mark a[i][j] if a[i][j] = 0
            for(int i = 0; i< m; i++){
                for(int j = 0; j< n; j++){
                    if(a[i][j] == 0){
                        a[i][j] = MARK_VALUE;
                    }
                }
            }
            
            //Change all element in row i and column j if a[i][j] is marked
            for(int i = 0; i< m; i++){
                for(int j = 0; j< n; j++){
                    if(a[i][j] == MARK_VALUE){
                        for(int k = 0; k< m; k++){
                            if(k != i){
                                a[k][j] = 0;
                            }
                        }
                        for(int k = 0; k<n; k++){
                            if(k != j){
                                a[i][k] = 0;
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
            
            fis.close();
            dis.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("File is not found. Please check path to file");
        }
    }
    
    public static void spiral(String path_to_file){
        try {
            FileInputStream fis;
            fis = new FileInputStream(path_to_file);
            DataInputStream dis = new DataInputStream(fis);
            
            int m = dis.readInt();
            int n = dis.readInt();
            int[][] a = read_int_arr(dis, m, n);
            
            // Missing code
            
            fis.close();
            dis.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("File is not found. Please check path to file");
        }
        
    } 
    
    public static boolean check_sudoku_row_column(int[][] a){
        boolean[][] check = new boolean[a.length][a[0].length];

        // check row and column
        for(int i = 0; i< a.length; i++){
            for(int j = 0; j< a[0].length; j++){
                int idx_tocheck = a[i][j] - 1;
                if(!check[i][idx_tocheck]){
                    check[i][idx_tocheck] = true;
                }else{
                    return false;
                }

                if(!check[idx_tocheck][j]){
                    check[idx_tocheck][j] = true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean check_sudoku_3x3_matrix(int[][] a){
        boolean[] check = new boolean[a.length];
        int[] idx_check = {0, 3, 6};
        
        for(int i = 0; i< idx_check.length; i++){
            for(int j = 0; j< idx_check.length; j++){
                
                // small matrix is matrix with row starting from i->i+2 and column starting from j->j+2
                for(int u = 0; u < 3; u++){
                    for(int v = 0; v < 3; v++){
                        int idx_tocheck = a[i+u][j+v];
                        if(!check[idx_tocheck]){
                            check[idx_tocheck] = true;
                        }else{
                            return false;
                        }
                    }
                }
            }
        }
        
        return true;
    }
    
    public static void check_sudoku(String path_to_file){
        try {
            FileInputStream fis = new FileInputStream(path_to_file);
            DataInputStream dis = new DataInputStream(fis);
            
            int len_a = 9;
            int[][] a = read_int_arr(dis, len_a, len_a);
            
            if(check_sudoku_row_column(a) && check_sudoku_3x3_matrix(a)){
                System.out.println("This is a sudoku answer");
            }else{
                System.out.println("This is not a sudoku answer");
            }
            
            fis.close();
            dis.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("File is not found. Please check path to file");
        }
        
    } 
}

