package ControlStatements;

import java.util.Scanner;

public class Ladder_if {
    public static void main(String[] args) {
        System.out.println("enter your marks:");
        //scanner class
        Scanner sc = new Scanner(System.in);
       int  marks = sc.nextInt();
        
       // int marks = 0;
        if (marks >= 90) {
            System.out.println("Excellet grade 'A'");

        }
        else if (marks >= 80) {
            System.out.println("Good grade 'B");
        }
        else if (marks >= 70) {
            System.out.println("Good grade 'C");
        }
        else {
            System.out.println("try again");
        }
        sc.close();
    }
    
}


