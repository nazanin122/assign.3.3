/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task33;
import java.util.Scanner; 
/**
 *
 * @author 2277120
 */
public class Task33 {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
    public static int letterToNumber(char c) {
        c = Character.toLowerCase(c); 
        return c - 'a'; 
    }

    public static boolean isDivisible(int num) {
        return num % 3 == 0;
    }

    public static boolean isDivisible(int num, int base) {
        return num % base == 0;
    }

    public static boolean isDivisible(char letter) {
        int num = letterToNumber(letter);
        return isDivisible(num);
    }

    public static boolean isDivisible(char letter, int base) {
        int num = letterToNumber(letter);
        return isDivisible(num, base);
    }

    public static boolean isDivisible(char letter, char baseLetter) {
        int num = letterToNumber(letter);
        int base = letterToNumber(baseLetter);
        return isDivisible(num, base);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number and a base, separated by space: ");
        int number = scanner.nextInt();
        int base = scanner.nextInt();
        
        if (isDivisible(number)) {
            System.out.println(number + " is divisible by 3");
        } else {
            System.out.println(number + " is not divisible by 3");
        }

        System.out.print("\nPlease enter an English letter: ");
        char letter = scanner.next().charAt(0);


        System.out.print("Please enter a number base and an English letter base, separated by space: ");
        int letterBaseNumber = scanner.nextInt();
        char letterBaseChar = scanner.next().charAt(0);
        
        System.out.println();

        System.out.println("'" + letter + "' is divisible by " + letterBaseNumber);
        System.out.println("'" + letter + "' is divisible by '" + letterBaseChar + "'");
    }
}
