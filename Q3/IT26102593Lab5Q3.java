
import java.util.Scanner;

public class IT26102593Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;

        System.out.print("Enter start date: ");
        int startDate = input.nextInt();

        System.out.print("Enter end date: ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Invalid date");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Start date must be less than end date");
            return;
        }

        int days = endDate - startDate;
        double total = days * ROOM_CHARGE;
        double discount = 0;

        if (days >= 5) {
            discount = total * 0.20;
        }
        else if (days >= 3) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        System.out.println("Number of days: " + days);
        System.out.println("Total amount: Rs. " + finalAmount);

        input.close();
    }
}
