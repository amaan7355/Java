// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

import java.util.*;
public class fn_count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countPositive = 0;
        int countNegative = 0;
        int  countZero = 0;
        boolean continueInput = true;
        do{
            // System.out.println("Enter a numbers, Enter 0 stop");
            System.out.print("Enter a number, Enter 0 stop: ");
            int n = sc.nextInt();
            if (n == 0){
                continueInput = false;
            }
            else if (n > 0){
                countPositive++;
            }
            else if (n < 0){
                countNegative++;
            }
        }while(continueInput);

        System.out.println("Count of Positive numbers are: "+ countPositive);
        System.out.println("Count of Negative numbers are: "+ countNegative);
        System.out.println("Count of Zeros are: "+ countZero);
    }
}
