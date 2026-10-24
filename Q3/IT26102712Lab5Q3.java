import java.util.Scanner;
public class IT26102712Lab5Q3{
	public static void main(String[] args){
	final double roomChDay = 48000.00;
	int startDate, endDate, numOfDays;
	double totAmount;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter Start Date (1-31): ");
	startDate=input.nextInt();
	System.out.print("Enter End Date (1-31): ");
	endDate=input.nextInt();
	if(startDate<1 || startDate>31 || endDate<1 || endDate>31){
		System.out.print("Days must be between 1 and 31");
	}else if (startDate>endDate){
		System.out.print("Start Date must be less than End Date");
	}else{
		numOfDays=endDate-startDate;
		if (numOfDays<3){
			totAmount=roomChDay*numOfDays;
		}else if (numOfDays>=3 && numOfDays<=4){
			totAmount=roomChDay*numOfDays*90/100;
		}else{
			totAmount=roomChDay*numOfDays*80/100;
		}
		System.out.println("Room Charge Per Day: Rs. "+ roomChDay);
		System.out.println("Number of Days Reserved: "+ numOfDays);
		System.out.print("Total amount to be Paid: "+ totAmount);
	}
	}
}