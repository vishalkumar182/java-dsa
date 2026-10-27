package ControlStatements;

import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] ruby) {

        // int floor_number = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number between 1 to 5: ");
        int choices = sc.nextInt();

       
        switch (choices) {
            case 1:
                System.out.println(" Akash Beedroom");
                break;
            case 2:
                System.out.println(" Chandresh Beedroom");
                break;
            case 3:
                System.out.println(" Vishal Beedroom");
                break;
            case 4:
                System.out.println("Ruby Beedroom");
                break;

            case 5:
                System.out.println(" Deepak Beedroom");
                break;
            case 6:
                System.out.println(" Abu Beedroom");
                break;
            default:
                System.out.println(" invalid aisa koi floor nahi hai ");
                break;

        }
        sc.close();
    }
    
}
