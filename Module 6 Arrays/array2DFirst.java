// Basic 2D Array Program.

import java.util.*;
public class array2DFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the size of columns: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        //input rows
        for(int i=0; i<rows; i++){
            // input cols
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
