import java.util.*;

public class ScannerPlay{
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    System.out.println("This program computes monthly loan payments.");

    System.out.print("Loan amount: ");
    double loan = console.nextDouble();
    System.out.print("Number of years: ");
    int years = console.nextInt();
    System.out.println("Interest rate:");
    double rate = console.nextDouble();
    System.out.println();

    int n = 12 * years;
    double c = rate / 12.0 / 100.0;
    double payment = loan * c * Math.pow(1 + c, n) / (Math.pow(1 + c, n) - 1);
    System.out.println("Payment = $" + (int) payment);
  }
}