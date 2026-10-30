import java.util.Scanner;

	public class IT26102060Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;

        int startDate, endDate, days;
        double discount = 0;
        double totalAmount;

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();
		
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
        }

        else if (startDate >= endDate) {

            System.out.println("Error: Start Date must be less than End Date");
        }

        else {

            days = endDate - startDate;

            if (days < 3) {
                discount = 0;
            }
            else if (days <= 4) {
                discount = 10;
            }
            else {
                discount = 20;
            }

            totalAmount = days * ROOM_CHARGE;
            totalAmount = totalAmount - (totalAmount * discount / 100);

            System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE);
            System.out.println("Number of Days Reserved: " + days);
            System.out.println("Total Amount to be Paid: " + totalAmount);
        }

        input.close();
    }
}