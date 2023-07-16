// WAP to print the table of the number entered by the user.

import java.util.*;
public class pr_loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. ");
        int n = sc.nextInt();
        int i;
        for (i=1; i<=10; i++){
            System.out.println(n +  " X "+ i +" = " + n*i);
        }

    }
}
