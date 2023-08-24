// package Module_5_Functions;
import java.util.*;
public class function_name {
   public static void PrintMyName(String name){
    System.out.println(name);
    return;
   } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        PrintMyName(name);
    }
}
