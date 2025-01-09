package Ternary;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";

        System.out.println("You are: " + eligibility);

        scanner.close();
    }
}

