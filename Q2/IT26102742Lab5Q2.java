import java.util.Scanner;
public class IT26102742Lab5Q2{
	public static void main(String[] args){
		int noMem;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of members introduced: ");
		noMem = input.nextInt();
		if (noMem>=0){
			switch(noMem){
				case 0:
				    System.out.print("No Prize");
				    break;
				case 1:
					System.out.print("Prize is a : Pen");
				    break;
				case 2:
				    System.out.print("Prize is a : Umbrella");
				    break;
				case 3: 
					System.out.print("Prize is a : Bag");
				    break;
				case 4:
					System.out.print("Prize is a : Travelling Chair");
				    break;
				default:
					System.out.print("Prize is a : Headphones");
				    break;
			}
		}
		else{
			System.out.print("Input must be a number 0 or greater.");
		}
	}
}