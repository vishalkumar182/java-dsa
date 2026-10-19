package OOPS.Polymorphism;

public class  CompiletimeDemo {
    public static void main(String[] vkis) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two number is :" + calc.add(4, 6));
        System.out.println("Sum of four number is :" + calc.add(4, 6,8,87));
    }
}

class Calculator {
    int add(int a, int b, int c) {
        return a + b + c;

    }
    
    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    int add(int a, int b) {
        return a + b;
    }
}