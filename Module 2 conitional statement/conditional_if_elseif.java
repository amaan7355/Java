// WAP to enter two no. by the user and check whether the no's. are equal or not and if it's not equal then check which no. is greater.

import java.util.*;
public class conditional_if_elseif {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. n1 ");
        int n1 = sc.nextInt();
        System.out.print("Enter second no. n2 ");
        int n2 = sc.nextInt();

        if (n1 == n2){
            System.out.println("Both numbers are equal");
        }
        else if (n1>n2){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}
