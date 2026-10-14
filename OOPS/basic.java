package OOPS;

//  THE ENCAPSULATED BLUEPRINT CLASS
class Person {
    // 1. Data ko capsule me band kiya (private)
    private int age = 18; 

    // 2. GETTER (Khidki): Safe tarike se data ko read karne ke liye [85c73309]
    int getAge() {
        return age; 
    }

    // 3. SETTER (Chaukidar): Data validation ke baad data write karne ke liye [85c73309]
    void setAge(int newAge) {
        // Asli duniya ka data check: Age kabhi 0 ya negative nahi ho sakti
        if (newAge > 0) {
            age = newAge; 
            System.out.println("Success: Age updated successfully.");
        } else {
            System.out.println(" Error: Invalid age! Entry blocked by Security.");
        }
    }
}
