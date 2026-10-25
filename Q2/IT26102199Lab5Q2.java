import java.util.Scanner;

public class IT26102199Lab5Q2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        int numberOfMembers;
        System.out.print("Enter the number of new members introduced: ");
        numberOfMembers = input.nextInt();



        if (numberOfMembers < 0) {
            System.out.println("Error: Input must be a number 0 or greater");
            input.close();
            return; // exit program here if input is bad
        }

        int switchPrize = numberOfMembers;
        
        if (numberOfMembers >= 5) {
            switchPrize = 5;
        }

        switch (switchPrize) {
            case 0:
                System.out.println("No prize");
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
            case 5:
                System.out.println("Prize is a : Headphone");
                break;
            default:
                System.out.println("Error: Input must be a number 0 or greater");
        }

        input.close();


    }
}