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
//Phase 1: Rewriting the Blueprint with return
class Calculator {
    // 🌟 Notice: 'void' is changed to 'int' because it returns a whole number
    int add(int x, int y) {
        int sum = x + y;
        return sum; // 🚚 This delivers the value of sum back to the main method!
    }
    
    int sub(int x, int y) {
        return x - y; // 🔥 Shortcut: You can return the calculation directly!
    }
}
