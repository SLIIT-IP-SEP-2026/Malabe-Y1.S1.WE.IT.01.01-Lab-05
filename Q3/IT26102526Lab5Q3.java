import java.util.Scanner;

public class IT26102526Lab5Q3 { 
    public static void main(String[] args) {
        
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final double DISCOUNT_3_4_DAYS = 0.10;
        final double DISCOUNT_5_ORMORE_DAYS = 0.20;
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();
        
        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();
        
        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }
        
        
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }
        
        
        int daysReserved = endDate - startDate;
        double totalCost = daysReserved * ROOM_CHARGE_PER_DAY;
        
        
        double discountRate = (daysReserved >= 5) ? DISCOUNT_5_ORMORE_DAYS : 
                             (daysReserved >= 3) ? DISCOUNT_3_4_DAYS : 0.0;
        
        double finalAmount = totalCost * (1.0 - discountRate);
        System.out.println();
        System.out.println("Room Charge Per Dy: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + finalAmount);
        
        scanner.close();
    }
}
