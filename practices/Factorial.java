import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Fact fact = new Fact();
        Scanner sc = new Scanner(System.in);
        
        // Declare variables outside the loop so they can be accessed anywhere in main
        int number;
        int result;

        // This loop will run forever until it encounters a 'break' statement
        while (true) {
            System.out.print("Enter a positive number : "); 
            number = sc.nextInt();
            
            result = fact.factorial(number);
            
            if (result == -1) {
                // Show error message and let the loop repeat
                System.out.println("Invalid input! Negative numbers are not allowed. Try again.\n");
            } else {
                // If input is valid, print result and break out of the loop
                System.out.println("Factorial of " + number + " is " + result);
                break; 
            }
        }
        
        sc.close();
    }
}

class Fact { 
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else if (n < 0) {
            return -1;
        }
     
        return n * factorial(n - 1);
    }
}
