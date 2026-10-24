
import java.util.Scanner;

public class IT26102365Lab5Q3 {
    public static final double CHARGE = 48000.00;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int start = sc.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int end = sc.nextInt();

        if (start < 1 || start > 31 || end < 1 || end > 31) {
            System.out.println("Error: Days must be between 1 and 31");
        } else if (start >= end) {
            System.out.println("Error: Start Date must be less than End Date");
        } else {
            int days = end - start;
            double discount = days >= 5 ? 20 : days >= 3 ? 10 : 0;
            double total = days * CHARGE * (1 - discount / 100);

            System.out.printf("Room Charge Per Day: Rs. %.2f/=%n", CHARGE);
            System.out.println("Number of Days Reserved: " + days);
            System.out.printf("Total Amount to be Paid: Rs. %.2f%n", total);
        }

        sc.close();
    }
}

