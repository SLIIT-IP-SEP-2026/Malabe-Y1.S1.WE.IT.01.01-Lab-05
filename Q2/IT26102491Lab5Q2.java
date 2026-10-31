import java.util.Scanner;

public class IT26102491Lab5Q2 {
	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
		int  numOfMembers;
		
		System.out.print("Enter the number of new members:");
		numOfMembers = input.nextInt();
		
		if (numOfMembers < 0){
			System.out.print("Input must be a number 0 or greater");
			input.close();
			return; //if you enter negative number exit program
		}
	
		switch(numOfMembers){
			case 0 : System.out.print("No prize");
			break;
			
			case 1 : System.out.print("Pen");
			break;
			
			case 2 : System.out.print("Umbrella");
			break;
			
			case 3 : System.out.print("Bag");
			break;
			
			case 4 : System.out.print("Travelling Chair");
			break;
			
			default : System.out.print("Headphone");
		}
		
	}
}	