// package Module_5_Functions;

import java.util.Scanner;

public class function_multiply {
    public static int CalcProduct (int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. ");
        int a = sc.nextInt();
        System.out.print("Enter second no. ");
        int b = sc.nextInt();
        System.out.println("The multiply of two no's is: " + CalcProduct(a,b));                 
    }
}
