package ControlStatements;

import java.util.Scanner;

public class Nested_If_Assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Pehle SIRF MAIN GATE ka sawaal pucho
        System.out.println("Kya Main Gate khula hai? (true/false):");
        boolean isMainGateOpen = sc.nextBoolean();

        // 2. Bahar wala IF check karega
        if (isMainGateOpen == true) {
            System.out.println("Main gate se andar (aangan mein) aa gaye hoon..");
            
            //  MAGIC TRICK: Room ka sawaal sirf tabhi pucho jab tum andar aa chuke ho!
            System.out.println("Kya Room ka Gate khula hai? (true/false):");
            boolean isRoomGateOpen = sc.nextBoolean(); // Naya input variable is if ke scope ke andar

            // 3. Andar wala (Nested) IF check karega
            if (isRoomGateOpen == true) {
                System.out.println("Aap room ke andar aa chuke hai, aap paani pee sakte ho! ");
            } else {
                System.out.println("Andar ka gate band hai, paani nahi pee sakte! ");
            }
            
        } else {
            // Agar main gate hi false hai, toh direct yahan kood jayega aur program bina doosra sawaal puche band ho jayega!
            System.out.println("Main gate hi closed hai, toh andar kaise aayenge! ");
        }

        sc.close(); // Memory safe!
    }
}
