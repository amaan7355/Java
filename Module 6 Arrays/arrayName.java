// Take an array of names as input from the user and print them on the screen.

import java.util.*;
public class arrayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        String arr[] = new String[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the "+ i +"th array value: ");
            arr[i] = sc.next();
        }
        for (int i=0; i<arr.length; i++){
            //System.out.print(arr[i]+" ");
            System.out.println("name " + (i+1) +" is : " + arr[i]);
        }
    }
}
