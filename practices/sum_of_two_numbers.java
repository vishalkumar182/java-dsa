/* package practices;

public class sum_of_two_numbers {
    public static void main(String[] args) {
        int num_1;
        int num_2;
        int sum;

        num_1 = 23;
        num_2 = 43;
        sum = num_1 + num_2;
        System.out.println("sum of two numer is :" + sum);
        System.out.printf("sum of two number is: %d ", sum); // requires place holder 


   }
} */


// taking input from the user:

 

import java.util.Scanner; // import scanner class

public class sum_of_two_numbers {
    public static void main(String[] args) {
        int num_1;
        int num_2;
        // object creation 
        Scanner scanner = new Scanner(System.in);

        // taking input from the user 
        System.out.println("enter the first number:");
        num_1 = scanner.nextInt();

        System.out.println("enter the second number:");
        num_2 = scanner.nextInt();

        // adding two number 
        int sum = num_1 + num_2;
        System.out.println("sum of two number is :" + sum);
        scanner.close();

        
    }
    
} 


