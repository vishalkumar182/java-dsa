package Function;
// no input and no output
public class SmartHome {
    public static void main(String[] args) {
        // object creation 
        Home home = new Home();
        home.activateMorningRoutine();
        home.setAcTemperature(45);
    }
}

class Home {
    void activateMorningRoutine() {
        System.out.println("Welcome vishal");
        System.out.println("Opening all samrt curtains");

    }

    void setAcTemperature(int temp) {
        
    System.out.println("AC temperature has been set to " + temp + " degrees."
    );

    }
}