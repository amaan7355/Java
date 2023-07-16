package Module_5_Functions;
import java.util.*;
public class function_sum {
    public static int CalcSum (int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. ");
        int a = sc.nextInt();
        System.out.print("Enter second no. ");
        int b = sc.nextInt();
        int sum = CalcSum(a,b);
        System.out.println("The Sum of two no's is: " + sum);
    }    
}
