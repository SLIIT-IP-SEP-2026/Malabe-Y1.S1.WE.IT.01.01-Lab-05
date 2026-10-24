import java.util.Scanner;
public class IT26102742Lab5Q3{
	public static void main(String[] args){
		int startDate;
		int endDate;
		int noDaysReserved=0;
		double CHARGE_PER_DAY=48000.00;
		double totWoDis;
		double totWDis;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Start Date(1-31): ");
		startDate= input.nextInt();
		System.out.print("Enter End Date(1-31): ");
		endDate = input.nextInt();
		if ((1<=startDate && startDate<=31) && (1<=endDate && endDate<=31)){
			if (startDate<endDate){
				noDaysReserved= endDate-startDate;
				totWoDis = CHARGE_PER_DAY*noDaysReserved;
				if (noDaysReserved<3){
					totWDis = totWoDis;
				}
				else if(noDaysReserved>=5){
					totWDis = totWoDis*0.8;
				}
				else {
					totWDis = totWoDis*0.9;
				}
				System.out.println("Room Charge Per Day: " +CHARGE_PER_DAY);
				System.out.println("Number of Days Reserved: " +noDaysReserved);
				System.out.println("Total Amount to be Paid: " +totWDis);
				
			}
			else{
				System.out.println("Error: Start Date must be less than End Date.");
			}
		}
		else{
			System.out.println("Error: Days must be between 1 and 31");
		}
		
	}
}