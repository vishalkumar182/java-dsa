package Recurssion;

public class Revrse_String {
    
}

class RevString {
    // base case
    String reverse(String str) {
            // 1. BASE CASE: If string is empty or 1 char long, stop recursion
            if (str == null || str.length() <= 1) {
                return str;
            }
         return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}