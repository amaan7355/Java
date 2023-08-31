// Take an array as input from the user. Search for a given number x and print the index at which it occurs.

import java.util.*;
public class array1DSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i=0; i<size; i++){
            System.out.print("Enter the "+ i+"th array value: ");
            arr[i] = sc.nextInt();
        }
        // System.out.println(arr.length);
        System.out.print("Enter the value to be searched: ");
        int x = sc.nextInt();
        for (int i=0; i<arr.length; i++){
            if(arr[i] == x){
                System.out.println(x+" is found at index number: "+i);
            }
        }
    }
}