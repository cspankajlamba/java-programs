/*
 * This Java program simulates a simple banking transaction where a user can withdraw an amount from their account balance.
 * It demonstrates the use of exception handling for managing insufficient balance scenarios.
 * 
 * Class: withDrawBalance
 * - The main class contains the logic for the banking transaction.
 * 
 * Functionality:
 * - Prompts the user to enter a withdrawable amount.
 * - Checks if the entered amount is greater than the available balance.
 * - If the amount is greater, it throws an ArithmeticException indicating "Insufficient Balance".
 * - If the amount is within the available balance, it deducts the amount from the balance and confirms the transaction.
 * 
 * Components:
 * - Scanner: Used to take input from the user.
 * - try-catch block: Used for handling the ArithmeticException in case of insufficient balance.
 * 
 * Note:
 * - This is a simplified example for educational purposes and does not include advanced banking features like account verification, 
 *   logging, or database integration.
 * 
 * Author: [Your Name]
 * Date: [Current Date]
 */

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner input = new Scanner(System.in);
        
        // Set initial available balance
        int availBalance = 3500;
        
        // Prompt user for the withdrawable amount
        System.out.print("Enter withdrawable amount -> ");
        int withDrawBalance = input.nextInt();
        
        try {
            // Check if available balance is less than the requested withdrawal amount
            if (availBalance < withDrawBalance) {
                // Throw exception if balance is insufficient
                throw new ArithmeticException("Insufficient Balance");
            } else {
                // Deduct the withdrawal amount from available balance
                availBalance -= withDrawBalance;
                // Confirm transaction success
                System.out.println("Transaction Successful!");
                System.out.println("Remaining Balance : " + availBalance);
                System.out.println("Thank you for choosing Bank!");
            }
        } catch (ArithmeticException e) {
            // Handle the exception and print the error message
            System.out.println(e.getMessage());
        }
    }
}
