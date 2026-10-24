import java.util.Scanner;
public class IT26102712Lab5Q1{
public static void main(String[] args){
	int fi;
	int si;
	int ti;
	Scanner abc=new Scanner(System.in);
	System.out.print("Enter the first integer: ");
	fi=abc.nextInt();
	System.out.print("Enter the second integer: ");
	si=abc.nextInt();
	System.out.print("Enter the third integer: ");
	ti=abc.nextInt();
	System.out.println("User entered numbers are: " + " " + fi + " " + si + " " + ti);
	if (fi>si && fi>ti){ 
	System.out.println("The largest number is: " + fi);
	}else if (si>fi && si>ti){
	System.out.println("The largest number is: "+ si);
	}else if (ti>fi && ti>si){
	System.out.println("The largest number is: "+ ti);
	}if (fi<si && fi<ti){
	System.out.print("The Smallest number is: "+fi);
	}else if (si<fi && si<ti){
	System.out.print("The Smallest number is: "+si);
	}else if (ti<fi && ti<si){
	System.out.print("The Smallest number is: "+ti);
	}
}
	
}