package Variables;

public class Local_var {
    public static void main(String[] args) {
        // object creation 
        ATM atm = new ATM();

        System.out.println("Please wait for a moment...");
        atm.withdraw();
        System.out.println("Transaction successful");
        System.out.println("Thank u");

       // System.out.println("Entered amt : " + entered_Amt); // error 
    }

    
    
}

class ATM {
    // methods 
    void withdraw() {
        int entered_Amt = 7856;// local var --scope inside this fxn only 
        System.out.println("Processing amount " + entered_Amt + " from your bank account");
       }
    }