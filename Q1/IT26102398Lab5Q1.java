import java.util.Scanner;
public class IT26102398Lab5Q1 {
	public static void main(String []args) {
		// Three integers
		int num_One, num_Two, num_Three;
		Scanner input = new Scanner(System.in);
		// First Integer
		System.out.print("Enter the first integer: ");
		num_One = input.nextInt();
		// Second Integer
		System.out.print("Enter the second integer: ");
		num_Two = input.nextInt();
		// Third Integer
		System.out.print("Enter the third integer: ");
		num_Three = input.nextInt();
		// Compute the smallest and largest of these numbers
		System.out.print("\nUser entered numbers are: " + num_One + " " + num_Two + " " + num_Three);
		// The Smallest Number
		// First Integer
		if (num_One < num_Two && num_One < num_Three) {
			System.out.print("\nThe Smallest number is: " + num_One);
		}
		// Second Integer
		if (num_Two < num_One && num_Two < num_Three) {
			System.out.print("\nThe Smallest number is: " + num_Two);
		}
		// Third Integer
		if (num_Three < num_One && num_Three < num_Two) {
			System.out.print("\nThe Smallest number is: " + num_Three);
		}
		else {
			System.out.print("\nThe Smallest number is: Invalid Inputs");
		}
		// The Largest Number
		// First Integer
		if (num_One > num_Two && num_One > num_Three) {
			System.out.print("\nThe Largest number is: " + num_One);
		}
		// Second Integer
		if (num_Two > num_One && num_Two > num_Three) {
			System.out.print("\nThe Largest number is: " + num_Two);
		}
		// Third Integer
		if (num_Three > num_One && num_Three > num_Two) {
			System.out.print("\nThe Largest number is: " + num_Three);
		}
		else {
			System.out.print("\nThe Largest number is: Invalid Inputs");
		}
	}
}