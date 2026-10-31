import java.util.Scanner;

public class IT26102556L5Q1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

       
        System.out.print("Enter number : ");
        int number = Scan.nextInt();

        int max = number; 
        int min = number; 

       
        int count = 1;
        while (count <= 3) {
            System.out.print("Enter next number: ");
            number = Scan.nextInt();

           
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
			 if (number > max) {
                max = number;
            }

            count++; 
        }

        
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
    }
}
		 
	 
	 