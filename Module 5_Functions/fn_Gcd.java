// Write a function that calculates the Greatest Common Divisor of 2 numbers. 

import java.util.*;
public class fn_Gcd {
    public static int calcGcd(int n1, int n2){
        while(n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. ");
        int num1 = sc.nextInt();
        System.out.print("Enter second no. ");
        int num2 = sc.nextInt();
        int result = calcGcd(num1, num2);
        System.out.println("Gcd of two no. is: " + result);
    }
}
