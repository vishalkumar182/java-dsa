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

public class Calculator_demo {
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
}