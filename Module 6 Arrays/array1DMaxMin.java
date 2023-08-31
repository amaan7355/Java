// Find the maximum & minimum number in an array of integers.

import java.util.*;
public class array1DMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the "+ i +"th array value: ");
            arr[i] = sc.nextInt();
        }
        // Initialize max and min.
        int max = arr[0];
        int min = arr[0];

        // loop to check max 
        for(int i=0; i<arr.length-1; i++){
            if(max<arr[i+1]){
                max = arr[i+1];
            }
        }

        // loop to check min
        for(int i=0; i<arr.length-1; i++){
            if(min>arr[i+1]){
                min = arr[i+1];
            }
        }

        System.out.println("Maximum Number is: " + max);
        System.out.println("Minimum Number is: " + min);
    }
}
