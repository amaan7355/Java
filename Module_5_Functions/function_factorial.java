package Module_5_Functions;
import java.util.*;
public class function_factorial {
    public static void fact (int n) {
        if (n<0){
            System.out.println("Invalid No.");
            return;
        }
        int f=1;
        for (int i=1; i<=n; i++){
            f = f*i;
        }
        System.out.println("The factorial of a no. is: " + f);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. ");
        int n = sc.nextInt();
        fact (n);
    }
}
