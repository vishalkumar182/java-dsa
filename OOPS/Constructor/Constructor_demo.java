package OOPS.Constructor;

public class Constructor_demo {
    public static void main(String[] args) {
        // object creation 
        Student s = new Student();
        Student s2 = new Student(23);
        Student s3 = new Student(23, "vishal");
        Student s4 = new Student(23, "vishal", "IITD", "CSE","Tuticorin");
        System.out.println(s);
         System.out.println(s2);


    }


}

class Student {
    // properties
    String name;
    int age;
    String college ;
    String department;
    String city;
    
    // empty constructor
    Student() {
        System.out.println("empty");


    }

    // one argument
    Student(int a) {
        age = a;
         System.out.println(a);
    }

    Student(int a, String n) {
        age = a;
        name = n;
         System.out.println(a  + " "+ n);

}

Student(int a, String n, String c) {
    
  age = a;
  name = n;
  college = c;
  System.out.println(a  + " "+ n + " " + c);
        
    }

    Student(int a, String n, String c, String d) {

        age = a;
        name = n;
        college = c;
        department = d;

    }

    Student(int age, String name, String college, String department, String city) {
            // optimised way use this keyword when parameter name and class variabls name are same

        this.age = age;
        this.name = name;
        this.college = college;
        this.department = department;
        this.city = city;
        System.out.println(age + " "+ name+ " " + college + " " + department + " " + city);
    }
    
    
}
