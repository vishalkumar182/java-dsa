package OOPS.Inheritance;

public class SingleInheritance {
    public static void main(String[] vkis) {
        Developer dev = new Developer();
        dev.breathe();
        dev.develop();
    }
    
}

class Human {
    // methods

    void breathe() {
        System.out.println("hii i am alive");
}
}

class Developer extends Human{
    // methods
    void develop() {
        System.out.println("i am writing code in java");
    }
}