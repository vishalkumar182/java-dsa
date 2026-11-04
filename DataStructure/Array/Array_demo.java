package DataStructure.Array;

import java.util.Scanner;

public class Array_demo {
    public static void main(String[] args) {
        // array literal     
        int[] array = { 10, 20, 30, 40, 50 };
        System.out.println("First element : " + array[0]);
        System.out.println("Second  element : " + array[1]);

        /*   for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
            
        */

        for (int i : array) {
            System.out.println(i);
        }
    }
    
   
}
