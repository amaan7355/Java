// WAP to check whether the no. is prime or not entered by the user.

import java.util.*; 
public class pr_loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. ");
        int n = sc.nextInt();
        int i;
        boolean isPrime = true;
        for (i=2; i<n; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }

        }
        if (isPrime){
            System.out.println("Prime No.");
        }
        else{
            System.out.println("Not a Prime No.");
        }
    }
}
