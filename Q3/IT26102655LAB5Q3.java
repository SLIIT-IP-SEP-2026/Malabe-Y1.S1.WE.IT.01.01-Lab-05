import java.util.Scanner;

	public class IT26102655LAB5Q3 {
		public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Declare constants
		final double ROOM_CHARGES = 48000.00;
		final double DISCOUNT_3_TO_4 = 0.10;
		final double DISCOUNT_5_OR_MORE = 0.20;
		
		
		// Inputs
		System.out.print("Enter the Start Date (1-31): ");
		int StartDate = scanner.nextInt();
		
		System.out.print("Enter the End Date (1-31): ");
		int EndDate = scanner.nextInt();
		
		
		//Calculation
		int DaysReserved      = (EndDate - StartDate);
		double Discount       = (DaysReserved >=5) ? DISCOUNT_5_OR_MORE : 
						        (DaysReserved >=3) ? DISCOUNT_3_TO_4 : 0.0;
		double Total 		  = (ROOM_CHARGES * DaysReserved);
		double DiscountAmount = Total * Discount;
		double FinalAmount    = Total - DiscountAmount;
		
		scanner.close();
		
		//Outputs
		//Validations
		if (StartDate > EndDate || StartDate == EndDate) {
			System.out.println("Error: Start Date must be less than End Date");
		}
		
		if (StartDate < 1 || EndDate > 31) {
			System.out.println("Error: Days must be between 1 and 31");
		}
		
		if (StartDate < EndDate && StartDate >= 1 && EndDate <= 31) {
			System.out.println("Room charge per Day: Rs. " + ROOM_CHARGES);
			System.out.println("Number of Days Reserved: " + DaysReserved);
			System.out.println("Total Amount to be Paid: " + Total);
			System.out.println("Discount Amount : " + DiscountAmount);
			System.out.println("Final Amount to be Paid: " + FinalAmount);
		}
	}
	}