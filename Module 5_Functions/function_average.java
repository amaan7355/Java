// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
public class function_average{
    public static float calcAvg(float n1, float n2, float n3){
        float avg = (n1+n2+n3)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. ");
        float num1 = sc.nextInt();
        System.out.print("Enter second no. ");
        float num2 = sc.nextInt();
        System.out.print("Enter third no. ");
        float num3 = sc.nextInt();
       float result = calcAvg(num1, num2, num3);
        System.out.println("Average of three numbers are: "+ result);
        
    }
}