import java.util.Scanner;

public class NumberCountProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        boolean continueInput = true;
        
        System.out.println("Enter numbers. Enter 0 to stop.");
        
        do {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            
            if (num == 0) {
                continueInput = false;
            } else if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            
        } while (continueInput);
        
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zeros: " + zeroCount);
        
        scanner.close();
    }
}

