package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your first number?");
		n1 = scan.nextInt();
		
		System.out.println("What is your second number?");
		n2 = scan.nextInt();
		
		double average = (n1+n2)/2.0;
		
		System.out.println("The average of your numbers is: " + average);
		
		// TODO Auto-generated method stub

	}
 
}



        
 
