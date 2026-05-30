import java.util.Scanner;

public class FindLargestNumber {
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
        
        int largest = firstNumber;
        
        if (secondNumber > largest) {
            largest = secondNumber;
        } else if (thirdNumber > largest) {
            largest = thirdNumber;
        } else if (fourthNumber > largest) {
            largest = fourthNumber;
        } else {
            largest = fifthNumber;
        }
        
        System.out.println(largest);
    
    }
}
