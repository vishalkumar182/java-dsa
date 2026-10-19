package OOPS.Inheritance;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Beta beta = new Beta();
        beta.show(); 
    }
    
}

class Papa {
    String bike = "Pulsar";

}

class Beta extends Papa {
    String bike = "Bullet";

    void show() {
        System.out.println("My bike: " + bike);
        System.out.println("Papa ki bike: " + super.bike);
    }
}