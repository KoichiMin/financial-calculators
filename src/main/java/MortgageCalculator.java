import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan length in years :");
        int loanLengthYears = scanner.nextInt();

        scanner.close();

        // monthly interest rate and total number of payments
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = loanLengthYears * 12;

        // monthly payment using the formula for a fixed-rate mortgage
        double monthlyPayment = (principal * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        // total amount paid and total interest paid
        double totalAmountPaid = monthlyPayment * numberOfPayments;
        double totalInterestPaid = totalAmountPaid - principal;


        System.out.println("\nMortgage Details:");
        System.out.println("Principal Amount: $" + principal);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Loan Length: " + loanLengthYears + " years");
        System.out.printf("Monthly Payment: $%.2f\n", monthlyPayment);
        System.out.printf("Total Amount Paid: $%.2f\n", totalAmountPaid);
        System.out.printf("Total Interest Paid: $%.2f\n", totalInterestPaid);
    }
}
