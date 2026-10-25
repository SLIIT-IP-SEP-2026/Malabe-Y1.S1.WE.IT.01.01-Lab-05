import java.util.Scanner;

public class IT26102199Lab5Q1 {
	public static void main(String[]args) {

        int f_int, s_int, t_int, small_n, large_n;
        f_int = 0;
        s_int = 0;
        t_int = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First integer: ");
        f_int = input.nextInt();

        System.out.print("Enter Second integer: ");
        s_int = input.nextInt();

        System.out.print("Enter Third integer: ");
        t_int = input.nextInt();

        System.out.println("User entered numbers are: " + f_int + " " + s_int + " " + t_int);
        
		small_n = f_int;
		
		if(small_n > s_int) {
			small_n = s_int;
			
		} else if (small_n > t_int) {
			small_n = t_int;
		}
		
		large_n = f_int;
		if(large_n < s_int) {
			large_n = s_int;
		} else if(large_n < t_int) {
			large_n = t_int;
		}
		
		System.out.println("The Smallest number is: " + small_n);
		System.out.println("The Largest number is: " + large_n);
    }
}