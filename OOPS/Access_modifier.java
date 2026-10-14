package OOPS;

public class Access_modifier {
    public static void main(String[] args) {
        Bank_account account = new Bank_account();
        account.dispplay_details();
        //account.name;
        //account.password;

        System.out.println("name:" + account.name);
       // System.out.println("password:" + account.password); // access from outside the class

    }
    
}

class Bank_account {
    // variables
    String name = "Vishal kumar";
      private String password = "rupher";

    void dispplay_details() {
        System.out.println("Password:" + password);// access within the class
    }
    
}
