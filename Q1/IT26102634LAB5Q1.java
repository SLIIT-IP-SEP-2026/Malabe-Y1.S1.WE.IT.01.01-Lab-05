
import java.util.Scanner;
	
	public class IT26102634LAB5Q1{
		public static void main (String[] args){
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the First Integer:");
			int numOne = input.nextInt();
			
			System.out.print("Enter the Second Integer:");
			int numTwo = input.nextInt();
			
			System.out.print("Enter the Third Integer:");
			int numThree = input.nextInt();
			
			int smallest = numOne;
			int largest = numOne;
			
			if (numTwo < smallest){
				smallest = numTwo;
				
			}
			
			if (numThree < smallest){
				smallest = numThree;
			}
			
			if (numTwo < largest){
				largest = numTwo;
			}
			
			if (numThree < largest){
				largest = numThree;
			}
			
			System.out.println("User entered numbers are:" + numOne + " " + numTwo + " " + numThree);
			System.out.println("Smalesst numer is" + smallest);
			System.out.println("The Largest number is" + largest);
			
			input.close();
			}
	
}

		

		 