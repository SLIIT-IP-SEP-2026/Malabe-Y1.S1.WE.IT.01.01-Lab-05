import java.util.Scanner;

public class IT26102473Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;

        System.out.print("Enter start date: ");
        int start = input.nextInt();
        System.out.print("Enter end date: ");
        int end = input.nextInt();

        if (start < 1 || start > 31 || end < 1 || end > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            System.exit(0);
        }
        if (start >= end) {
            System.out.println("Error: Start date should be less than end date.");
            System.exit(0);
        }

        int days = end - start;
        double total = days * ROOM_CHARGE;

        if (days >= 5) {
            total = total - total * 0.20;
        } else if (days >= 3) {
            total = total - total * 0.10;
        }

        System.out.println("Days reserved: " + days);
        System.out.println("Total amount to pay: Rs " + total);
    }
}