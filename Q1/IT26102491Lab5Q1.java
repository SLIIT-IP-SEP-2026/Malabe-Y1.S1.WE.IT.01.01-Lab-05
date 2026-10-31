import java.util.Scanner;

public class IT26102491Lab5Q1 {
	public static void main(String[]args) {
		
		Scanner input=new Scanner(System.in);
		
        int num_One,num_Two,num_Three,small_num,large_num;
		
		System.out.print("Enter the first integer:");
		num_One=input.nextInt();
		
		System.out.print("Enter the second integer:");
		num_Two=input.nextInt();
		
		System.out.print("Enter the third integer:");
		num_Three=input.nextInt();
		
		System.out.println("\nUser enterd numbers are:" +num_One + " " +num_Two + " " +num_Three);
		
		small_num = num_One;
		
		if(small_num > num_Two){
			small_num = num_Two;
			
		}else if (small_num > num_Three){
			small_num = num_Three;
		}
		
		large_num = num_One;
		
		if(large_num < num_Two){
			large_num = num_Two;
		
		}else if(large_num < num_Three){
			large_num = num_Three;
		
		}
		
		System.out.println("\nThe smallest number is:" +small_num);
		
		System.out.println("\nThe Largest number is:" +large_num);
		
		}
}	