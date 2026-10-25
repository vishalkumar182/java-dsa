package Variables;

public class Static_var {
    public static void main(String[] Args) {

        System.out.println("School name: " + Static_demo.school);

        // method calling
        System.out.println("5 square is " + Static_demo.square(5));

    }

}

class Static_demo {
    // static variables
    static String school = "Bethesda Christian Academy";

    // static methods 
    static int square(int n) {
        return n * n;
        
    }
}
