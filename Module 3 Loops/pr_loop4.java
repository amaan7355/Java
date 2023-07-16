import java.util.*;
public class pr_loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input,m;
        do{
            System.out.print("Enter your marks: ");
            m = sc.nextInt();
            if (m >= 75 && m <= 100){
                System.out.println("These marks are good");
            }
            else if (m >= 50 && m <= 74){
                System.out.println("These marks are good but average");
            }
            else if (m >= 0 && m <= 49){
                System.out.println("These marks are ok but not good");
            }
            else {
                System.out.println("Invalid marks");
            }
            System.out.print("Do you want to continue Yes(1) or No (0): ");
            input = sc.nextInt();
        }while(input == 1);
    }
}
