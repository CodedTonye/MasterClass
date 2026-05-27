import java.util.Scanner;

public class SumUserInput {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
    
        int total = 0;
        
        for (int count = 1; count <= 5; count++) {
            System.out.print("Enter an Integer: ");
            int number = inputCollector.nextInt();
        
            total += number;
        
            
        }
        System.out.println("Sum of Numbers: " + total);
        
    }
}
