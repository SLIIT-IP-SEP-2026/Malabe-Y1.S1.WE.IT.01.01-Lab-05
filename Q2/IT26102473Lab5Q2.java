import java.util.Scanner;
 
public class IT26102473Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the number of new members introduced: ");
        int members = input.nextInt();
 
        if (members < 0) {
            System.out.println("Invalid number! Please enter 0 or more.");
        } else if (members == 0) {
            System.out.println("Prize: No Prize");
        } else if (members == 1) {
            System.out.println("Prize: Pen");
        } else if (members == 2) {
            System.out.println("Prize: Umbrella");
        } else if (members == 3) {
            System.out.println("Prize: Bag");
        } else if (members == 4) {
            System.out.println("Prize: Travelling Chair");
        } else {
            System.out.println("Prize: Headphone");
        }
    }
}
 