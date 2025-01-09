package Switch;

import java.util.Scanner;

    public class GradeChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter your grade (A, B, C, D, F): ");
            char grade = scanner.next().charAt(0);
    
            switch (grade) {
                case 'A':
                    System.out.println("Excellent!");
                    break;
                case 'B':
                    System.out.println("Good job!");
                    break;
                case 'C':
                    System.out.println("You can do better.");
                    break;
                case 'D':
                    System.out.println("Try harder.");
                    break;
                case 'F':
                    System.out.println("Failed. Better luck next time.");
                    break;
                default:
                    System.out.println("Invalid grade entered!");
            }
    
            scanner.close();
        }
    }
    
