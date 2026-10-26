import java.util.Scanner;

public class IT26102470Lab5Q3 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation 1 - Days must be between 1 and 31
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2 - Start date should be less than the end date
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        // Calculate number of days
        int numDays = endDate - startDate;

        // Calculate total before discount
        double totalBeforeDiscount = numDays * ROOM_CHARGE_PER_DAY;

        // Find discount rate
        double discountRate = 0;
        if (numDays >= 3 && numDays <= 4) {
            discountRate = DISCOUNT_3_4_DAYS;
        } else if (numDays >= 5) {
            discountRate = DISCOUNT_5_MORE_DAYS;
        }

        // Calculate total to be paid
        double discountAmount = totalBeforeDiscount * discountRate / 100;
        double totalToPay = totalBeforeDiscount - discountAmount;

        // Output
        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + numDays);
        System.out.println("Total Amount to be Paid: " + totalToPay);

        scanner.close();
    }
}