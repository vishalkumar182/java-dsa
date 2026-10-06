package practices;

public class Electric_car_demo {
    public static void main (String[] args) {
        // Step 1: object creation 
        Electric_car car = new Electric_car();

        // Step 2: using variables and methods
        System.out.println(" Car color :" + car.color);
        System.out.println("Auto_pilot : " + car.isAutopilot_available);
        //System.out.println("Status :" + car.startEngine());
        car.startEngine();
    }
    
}

class Electric_car {
    // variable(properties)
    String company = "Tesla";
    String color = "Matter black";
    int topspeed = 200;
    boolean isAutopilot_available = true;


    // methods(action)
    void startEngine() {
        System.out.println("Silent electric engine started. Ready to drive");
    }
}