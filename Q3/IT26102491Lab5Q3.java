import java.util.Scanner;

public class IT26102491Lab5Q3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double discountRate, totalRoomCharge, discountAmount, totalAmountDue;
		int reservedDays, endDay, startDay;

		final double DISCOUNT_BELOW_3_DAYS = 0.00;
		final double DISCOUNT_3_TO_4_DAYS = 0.10; 
		final double DISCOUNT_5_OR_MORE_DAYS = 0.20; 
		final double ROOM_CHARGE_PER_DAY = 48000.00; 
		
		System.out.print("Enter Start Date (1-31): ");
		startDay = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		endDay = input.nextInt();

		//validation 1
        if ((startDay <= 0 || endDay <= 0) && (startDay > 31  || endDay > 31 )) {
            System.out.println("Error: Days must be between 1 and 31");
            input.close();
            return; 
        }
        //validation 2
        if (startDay >= endDay) {
            System.out.println("Error: Start Date must be less than End Date");
            input.close();
            return;
        }

		reservedDays = endDay - startDay;
			
		if (reservedDays < 3 ){
			discountRate = DISCOUNT_BELOW_3_DAYS;
					
		} else if (reservedDays >= 3 && reservedDays <= 4) {
			discountRate = DISCOUNT_3_TO_4_DAYS;

					
		} else {
			discountRate = DISCOUNT_5_OR_MORE_DAYS;	
		}

		totalRoomCharge = reservedDays * ROOM_CHARGE_PER_DAY;
		discountAmount = totalRoomCharge * discountRate;
		totalAmountDue = totalRoomCharge - discountAmount;

		System.out.println("\nRoom Charge Per Day: " + ROOM_CHARGE_PER_DAY + "/=");
		System.out.println("\nNumber of Days Reserved: " + reservedDays);
		System.out.println("\nTotal Amount to be Paid: " + totalAmountDue + "/=");

       

    }
}