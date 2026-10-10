


public class Smartphone_Demo {
    public static void main(String[] args) {
        // object creation 
        Smartphone phone = new Smartphone();


        System.out.println("Phone brand is: " + phone.brand);
        System.out.println("Mobile storage is: " + phone.storage);
        phone.chargePhone();
    }
}

class Smartphone {

    //  variables(properties)
    String brand = "Apple";
    String model = "iPhone15";
    String storage = "256 GB";
    String battery_percentage = "85%";

    // methods(action)
    void chargePhone() {
        System.out.println("Phone is charging... current battery is : " + battery_percentage);
     }





}