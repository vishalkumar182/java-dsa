package Function;

import java.util.*;

public class Addition {
    public static void main(String[] args) {
        // object creation 
        Sum sum = new Sum();
        // taking input from the user 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();


        System.out.println("Sum of two number a and b is: " + sum.add(a, b));
        

        


    }
    
}

class Sum {
    // adding two number a & b
    public int add(int a, int b) {
        return a + b;
    }
}