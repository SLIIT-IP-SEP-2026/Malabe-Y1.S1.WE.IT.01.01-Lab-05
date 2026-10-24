import java.util.Scanner;

public class IT26102719Lab5Q3 {

    public static final double ROOM_CHARGE_PER_DAY = 48000.0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int numberOfDays = endDate - startDate;

        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;

        // Apply discount
        if (numberOfDays == 4) {
            totalAmount = totalAmount - (totalAmount * 0.10);
        } else if (numberOfDays >= 5) {
            totalAmount = totalAmount - (totalAmount * 0.20);
        }

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. 48000.0/=");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        input.close();
    }
}