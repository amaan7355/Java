// WAP to print sum of n natural no. entered by user.

import java.util.*;
public class pr_loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. ");
        int n = sc.nextInt();
        int i, sum=0;
        for (i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum is: "+sum);

    }

}
