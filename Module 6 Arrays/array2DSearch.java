// Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

import java.util.*;
public class array2DSearch {
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
        System.out.print("Enter the number to be searched: ");
        int x = sc.nextInt();
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (arr[i][j] == x){
                    System.out.println(x + " is found at index "+ i+","+j);
                }
            }
        }
    }
}
