/** Check whether the given number is a perfect number or not */
//Programmed by Venkata Krishna Kanth Musunuru

import java.util.Scanner;

public class NinthQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is perfect or not");
		int number = S.nextInt(), sum=0;
		
		for(int i=1; i<=number/2; i++){
			if(number%i==0){				
				sum+=i;
				System.out.print(i+"+");
			}
			
		}
		System.out.print(" = "+sum+"\n");
		if(sum==number)
			System.out.println("The given number "+number+" is a perfect number");
		else
			System.out.println("The given number "+number+" is not a perfect number");
	}

}
