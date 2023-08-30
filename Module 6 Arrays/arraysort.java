// Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.*;

public class arraysort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("The array is sorted in Ascending Order");
        } else {
            System.out.println("The array is not sorted in Ascending Order");
        }
    }
}
