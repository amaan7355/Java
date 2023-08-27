// Write a program to print Fibonacci series of n terms where n is input by user :

import java.util.*;
public class fn_Fibonacci {
    public static void calcFib(int num){
        int a=0, b=1;
        System.out.print(a+" ");
        for (int i=2; i<=num; i++){
            System.out.print(b+" ");
            int temp = b;
            b = a+b;
            a = temp;
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of Fibonacci Series: ");
        int n = sc.nextInt();
        calcFib(n);
    }
}
