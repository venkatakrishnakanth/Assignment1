/*** Check whether a given number is prime or not*/
//Programmed by Venkata Krishna Kanth Musunuru

import java.util.Scanner;

public class ThirdQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number you want to check for prime:");
		Scanner S = new Scanner(System.in);
		int number = S.nextInt();
		boolean prime= true;

		for(int i=2; i<=number/2; i++){
			if(number%i==0)				
				prime=false;
			
		}
		if(prime)
			System.out.println(number+" is a prime number");
		else
			System.out.println(number+" is not a prime number");
	}

}
