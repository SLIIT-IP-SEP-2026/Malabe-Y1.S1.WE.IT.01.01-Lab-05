import java.util.Scanner;

public class IT26102482Lab4Q3 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a noumber: ");
		int num = input.nextInt();
		
		String result = (num > 0) ? "Positive"
		: (num < 0) ? "Negative"
		:"Zero";
		
		System.out.println(result);
		
		input.close();
	}
}