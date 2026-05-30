import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int firstNumber = inputCollector.nextInt();
        
        System.out.print("Enter second number: ");
        int secondNumber = inputCollector.nextInt();
        
        System.out.print("Enter third number: ");
        int thirdNumber = inputCollector.nextInt();
        
        System.out.print("Enter fourth number: ");
        int fourthNumber = inputCollector.nextInt();
        
        System.out.print("Enter fifth number: ");
        int fifthNumber = inputCollector.nextInt();
        
        int smallest = firstNumber;
        
        if (secondNumber < smallest) {
            smallest = secondNumber;
        } else if (thirdNumber < smallest) {
            smallest = thirdNumber;
        } else if (fourthNumber < smallest) {
            smallest = fourthNumber;
        } else {
            smallest = fifthNumber;
        }
        
        System.out.println(smallest);
    
    }
}
