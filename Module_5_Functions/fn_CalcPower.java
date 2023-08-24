// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;
public class fn_CalcPower{
    public static double calcPower(int x, int n){
        return Math.pow(x, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        double result = calcPower(x , n);
        System.out.println("Value of"+ x +"raise to the Power"+ n +" is: " + result);
    }
}

