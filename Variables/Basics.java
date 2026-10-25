package Variables;

// instances variables

public class Basics {
    public class Main {
        public static void main(String[] args) {

            // 1. Rahul ka object banaya aur uske dibbo mein data bhara
            Student s1 = new Student();
            s1.name = "Rahul";
            s1.age = 20;

            // 2. Amit ka object banaya aur uske dibbo mein data bhara
            Student s2 = new Student();
            s2.name = "Amit";
            s2.age = 22;

            // Ab dono ko print karke dekhte hain
            System.out.println(s1.name + " ki age hai: " + s1.age);
            System.out.println(s2.name + " ki age hai: " + s2.age);
        }

    }
}

class Student {
    // instance variables
    String name;
    byte age;
}