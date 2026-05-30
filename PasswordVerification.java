import java.util.Scanner;

public class PasswordVerification {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        String password = "Tygersmile";
        
        String userInput = "";
           
        while(!userInput.equals(password)) {
             System.out.print("Enter your Password: ");
             userInput = inputCollector.nextLine();
             
             if (!userInput.equals(password)) {
                System.out.print("Wrong Password! Enter Correct Password: ");
                userInput = inputCollector.nextLine();
            }   
            
        }
        System.out.println("Valid Password!");
    
    }
}
