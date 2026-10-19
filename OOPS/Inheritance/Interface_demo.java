package OOPS.Inheritance;

public class Interface_demo {
    public static void main(String[] args) {
        Tata_Consultancies tc = new Tata_Consultancies();
        tc.payTax();
        tc.health();
    }
}

// 1. Change these from 'class' to 'interface'
interface Central_Govt {
    void payTax(); // Interfaces hold method declarations without bodies
}

interface Health_Department {   
    void health();
}

// 2. Make Tata_Consultancies a class that implements both
class Tata_Consultancies implements Central_Govt, Health_Department {
    
    @Override
    public void payTax() {
        System.out.println("Central Govt rules : Pay tax");
    }

    @Override
    public void health() {
        System.out.println("Ensure safety measures inside the company");
    }
}
