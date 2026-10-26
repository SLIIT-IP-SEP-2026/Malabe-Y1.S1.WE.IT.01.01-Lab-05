import java.util.Scanner;

public class IT26102470Lab5Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced: ");
        int num = input.nextInt();

        // Validation - should be greater than or equal to 0
        if (num < 0) {
            System.out.println("Error: Number must be greater than or equal to 0");
            return;
        }

        switch (num) {
            case 0:
                System.out.println("No Prize");
                break;
            case 1:
                System.out.println("Prize is a : Pen");
                break;
            case 2:
                System.out.println("Prize is a : Umbrella");
                break;
            case 3:
                System.out.println("Prize is a : Bag");
                break;
            case 4:
                System.out.println("Prize is a : Travelling Chair");
                break;
            default:
                // For 5 or more
                System.out.println("Prize is a : Headphone");
                break;
        }

        input.close();
    }
}