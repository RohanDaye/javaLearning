package IfElse.NestedIfElse;

public class LoanApproval {
    public static void main(String[] args) {
        int creditScore = 700;
        int annualIncome = 50000;

        if (creditScore >= 750) {
            if (annualIncome >= 40000) {
                System.out.println("Loan Approved with Low Interest Rate.");
            } else {
                System.out.println("Loan Approved with Standard Interest Rate.");
            }
        } else {
            if (annualIncome >= 60000) {
                System.out.println("Loan Approved with High Interest Rate.");
            } else {
                System.out.println("Loan Denied.");
            }
        }
    }
}
