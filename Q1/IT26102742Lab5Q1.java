import java.util.Scanner;
public class IT26102742Lab5Q1{
	public static void main(String[] args){
		int num1;
		int num2;
		int num3;
		int smallest=0;
		int largest=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		num1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		num2 = input.nextInt();
		System.out.print("Enter the third integer: ");
		num3 = input.nextInt();
		if (num1>num2){
			if (num1>num3){
				if(num3>num2){
					largest=num1;
					smallest=num2;
				}
				else{
					largest = num1;
					smallest = num3;
				}
			}
			else{
				largest = num3;
				smallest= num2;
			}
		}
			
		else{
			if (num2>num3){
				if (num1>num3){
					smallest= num3;
					largest = num2;
				}
				else{
					largest = num2;
					smallest = num1;
				}
			}
			else{
				largest = num3;
				smallest= num1;
			}
		}
		System.out.println("User entered numbers are : " +num1 +" " +num2+ " " +num3);
		System.out.println("The smallest number is: " +smallest);
		System.out.println("The largest number is: " +largest);
	}	
}