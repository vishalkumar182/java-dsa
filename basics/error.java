/*
 * ==========================================================
 * 2. COMMON BASIC ERRORS
 * ==========================================================
 */


/*
 * ERROR 1: Code outside the main() method
 *
 * Wrong:
 *
 * public class java_basics {
 *
 *     System.out.println("Hello Vishal");
 *
 *     public static void main(String[] args) {
 *
 *     }
 * }
 *
 * Error:
 * cannot find symbol / illegal start of type
 *
 * WHY?
 *
 * System.out.println() is an executable statement.
 * It should be written inside a method such as main().
 */


/*
 * ERROR 2: Missing semicolon
 *
 * Wrong:
 *
 * System.out.println("Hello Vishal")
 *
 * Correct:
 *
 * System.out.println("Hello Vishal");
 *
 * Most Java statements end with a semicolon (;).
 */


/*
 * ERROR 3: Class name and file name mismatch
 *
 * Example:
 *
 * File name:
 * java_basics.java
 *
 * Class:
 * public class Hello
 *
 * This creates an error because a public class must have
 * the same name as the Java file.
 *
 * Correct:
 *
 * File name:
 * java_basics.java
 *
 * Class name:
 * public class java_basics
 */


/*
 * ERROR 4: Missing brackets
 *
 * Java uses:
 *
 * { }  -> block of code
 * ( )  -> method parameters / conditions
 *
 * Make sure every opening bracket has a closing bracket.
 *
 * Example:
 *
 * public class java_basics {
 *
 *     public static void main(String[] args) {
 *
 *         System.out.println("Hello Vishal");
 *
 *     }
 * }
 */

