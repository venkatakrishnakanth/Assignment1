/** Find the factorial of a given number */
//Programmed by Venkata Krishna Kanth Musunuru

import java.util.Scanner;

public class SeventhQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number to get its factorial value:");
		int number = S.nextInt();
		long fact=1;
		System.out.println("Factorial value of "+number+" is: ");
		while(number!=1){
			fact= fact*number;
			number-=1;
		}
		System.out.print(fact);
	}

}
