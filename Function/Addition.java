package Function;

import java.util.*;

public class Addition {
    public static void main(String[] args) {
        // object creation 
        Calc calc = new Calc();
        // taking input from the user 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();


        System.out.println("Sum of two number a and b is: " + calc.add(a, b));

        System.out.println("Sum of two number a and b is: " + calc.mul(a,b));

        

        


    }
    
}

class Calc {
    // adding two number a & b
    public int add(int a, int b) {
        return a + b;
    }

    // multiplication of two numbers:
    public int mul(int a, int b) {
        return a * b;
    }
}