// WAP to demonstrate how to take input from the user to perform operations.

import java.util.*;
class input { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
       String name = sc.nextLine();
       System.out.println("Your name is: "+name);
       System.out.print("Enter first no. ");
       int a = sc.nextInt();
       System.out.print("Enter second no. ");
       float b = sc.nextFloat();
       float sum = a + b;
       System.out.println("The sum is: "+ sum);
    }
    
}
