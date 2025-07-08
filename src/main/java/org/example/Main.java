package org.example;
import java.util.*;

/**
 *  1. Reads an integer
 *  2. Handle both invalid format and array index out of bounds
 *
 * */
public class Main {

    public static int returnIntElement(int[] numberArray, int chosenIndex) {
        return numberArray[chosenIndex];
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        int arrLength = numbers.length - 1;


        System.out.print("Enter an index number: (0-" + arrLength + "): ");

        try {
            int indexNumberEntered = sc.nextInt();
            int elementReceived = returnIntElement(numbers, indexNumberEntered);
            System.out.println("The element of the index you entered is: " + elementReceived);
        } catch (InputMismatchException e) {
            System.out.println("Incorrect input!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index does not exist!");
        } finally {
            System.out.println("Success!");
        }

        sc.nextLine();



//
//        for (int number: numbers) {
//            System.out.print(numbers);
//        }

        System.out.print("\nEnter the index of the number: ");


    }
}