/* package practices;

public class Calculator_demo {
    public static void main(String[] vish) {
        //add(12,12);
        Calculator calc = new Calculator();
        calc.add(12, 12);
        calc.sub(12, 12);
        calc.mul(12, 12);
        calc.div(12, 2);
    }

}

class Calculator {
    void add(int x, int y) {
        int sum = x + y;
        System.out.println("sum of two number is: " + sum);
    }
    
    void sub(int x, int y) {
        int sub = x - y;
        System.out.println("difference of two number is: " + sub);

    }
    
    void mul(int x, int y) {
        int mul = x * y;
        System.out.println("multiplication of two number is : " + mul);

    }

    void div(int x, int y) {
        int div = x / y;
           System.out.println("division of two number is : " + div);

    }
}
 */

/* public class Calculator_demo {
    public static void main(String[] vish) {
        //add(12,12);
        Calculator calc = new Calculator();
         int sum_result =calc.add(12, 12);
        int sub_result=calc.sub(12, 12);
        int mul_result=calc.mul(12, 12);
        int div_result = calc.div(12, 2);
        
        System.out.println("sum of two number is: " + sum_result);
        System.out.println("sub of two number is: " + sub_result);
        System.out.println("mul of two number is: " + mul_result);
        System.out.println("div of two number is: " + div_result);
    }

}

class Calculator {
    int add(int x, int y) {
        int sum = x + y;
        
        return sum;
       
    }
    
    int sub(int x, int y) {
        int sub = x - y;
        return sub;

       
        
    }
    
    int mul(int x, int y) {
        int mul = x * y;
        return mul;
       
    }

    int div(int x, int y) {
        int div = x / y;
        return div;
          

    }
} */

// Step 1: Import statement sabse upar
import java.util.Scanner;

// RULE FIXED: Saara active main code is class ke andar hona chahiye!
public class Calculator_demo { 
    public static void main(String[] vish) {
        
        // Step 2: Scanner object creation 
        Scanner input = new Scanner(System.in);

        // Taking input from the user 
        System.out.print("Enter the first number: ");
        int num_1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num_2 = input.nextInt();

        // Step 3: Create the calculator object from your blueprint class
        Calculator calc = new Calculator();
        
        // Step 4: Pass the dynamic user input variables as arguments!
        int sum_result = calc.add(num_1, num_2);
        int sub_result = calc.sub(num_1, num_2);
        int mul_result = calc.mul(num_1, num_2);
        int div_result = calc.div(num_1, num_2);
        
        // Step 5: Displaying the caught answers
        System.out.println("\n--- Results ---");
        System.out.println("Sum of two numbers is: " + sum_result);
        System.out.println("Sub of two numbers is: " + sub_result);
        System.out.println("Mul of two numbers is: " + mul_result);
        System.out.println("Div of two numbers is: " + div_result);
        
        // Step 6: Close scanner (Good practice!)
        input.close();
    }
}

// Blueprint Class (Yeh bilkul separate bahaar rahegi)
class Calculator {
    int add(int x, int y) {
        return x + y;
    }
    
    int sub(int x, int y) {
        return x - y;
    }
    
    int mul(int x, int y) {
        return x * y;
    }

    int div(int x, int y) {
        return x / y;
    }
}

