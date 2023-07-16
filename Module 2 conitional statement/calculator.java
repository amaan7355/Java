// WAP to enter two no's. by the user and generate a calculator which performs mathematical operations such as addition substraction multiplication division and modulus.

import java.util.*;
class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. ");
        int a = sc.nextInt();
        System.out.print("Enter second no. ");
        int b = sc.nextInt();
        System.out.print("Enter 1 for addition 2 for substraction 3 for multiplication 4 for division and 5 for modulus between two no's.");
        int operator = sc.nextInt();

        switch(operator){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: if (b==0){
                System.out.println("Invalid division");
                }
                else{
                    System.out.println(a/b);
                }
            break;        
            case 5: if(b==0){
                System.out.println("Invalid division");
            }
            else{
                System.out.println(a%b);
            }
            break;
            default : System.out.println("Invalid Operator");
            }
        }
}