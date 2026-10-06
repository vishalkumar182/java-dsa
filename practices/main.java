 package practices;
class Dog {

    // variables(properties of the dog)
    String breed = "german_shepherd";
    int age = 2;
    String colour = "red";
    String city = "hapur";

    // methods

    void bark() {
        System.out.println("ghar ki rakhwali ke lie bow bow karna hai :");
    }

}

public class main{
    public static void main(String[] args) {
        // object creation 
        Dog dog = new Dog();

        // using properties
        System.out.println("dog breed is " + dog.breed);
        System.out.println("dog age is : " + dog.age);

        
    }
    
}