import java.util.Scanner;
public class IT26102398Lab5Q3 {
	public static void main(String []args) {
		//Discount
		double discount;
		int start_Date, end_Date, gap;
		double room_Charges;
		// Constants
		final double ROOM_DAY_CHARGE = 48000.0;
		final double RATE_ONE = 0.1;
		final double RATE_TWO = 0.2;
		Scanner input = new Scanner(System.in);
		// Reservation Starting Date
		System.out.print("Enter Start Date (1 - 31): ");
		start_Date = input.nextInt();
		// Reservation Ending Month
		System.out.print("Enter End Date (1 - 31): ");
		end_Date = input.nextInt();
		// Validate the Reservation
		// Validate 2
		if (start_Date > end_Date) {
			System.out.print("Start Date must be less than End date");
			return;
		}
		// Validate 1
		if ((start_Date <= 0 || end_Date <= 0) && (start_Date > 31 || end_Date > 31)) {
			System.out.print("Days must be between 1 and 31");
			return;
		}
		// Discount Calculation
		gap = end_Date - start_Date;
		room_Charges = gap * ROOM_DAY_CHARGE;
		// 5 or more days Discount
		if (gap >= 5) {
			// Total Amount to be Paid
			discount = room_Charges - (room_Charges * RATE_TWO);
			System.out.print("\nRoom Charge Per Day: Rs. " + ROOM_DAY_CHARGE + "/=");
			System.out.print("\nNumber of Days Reserved: " + gap);
			System.out.print("\nTotal Amount to be Paid: " + discount);
		}
		else if (gap == 3 || gap == 4) {
			// Total Amount to be Paid
			discount = room_Charges - (room_Charges * RATE_ONE);
			System.out.print("\nRoom Charge Per Day: Rs. " + ROOM_DAY_CHARGE + "/=");
			System.out.print("\nNumber of Days Reserved: " + gap);
			System.out.print("\nTotal Amount to be Paid: " + discount);
		}
		else {
			// Total Amount to be Paid
			System.out.print("\nRoom Charge Per Day: Rs. " + ROOM_DAY_CHARGE + "/=");
			System.out.print("\nNumber of Days Reserved: " + gap);
			System.out.print("\nTotal Amount to be Paid: " + ROOM_DAY_CHARGE + "/=");
		}
	}
}