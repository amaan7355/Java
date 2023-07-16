// WAP to enter an age by the user and check whether he/she is adult or not.

import java.util.*;
public class conditional_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age>=18){
            System.out.println("You're Adult");
        }
        else {
            System.out.println("You're not Adult");
        }
    }
    
}
