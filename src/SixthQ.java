/** Check whether a given number is palindrome or not */
//Programmed by Venkata Krishna Kanth Musunuru

import java.util.Scanner;

public class SixthQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number you want to check for palindrome");
		int number = S.nextInt();
		int reverseNum=0,num1=number;
		while(number!=0){
			reverseNum=reverseNum*10+ number%10;
			//System.out.print(number%10);
			number = number/10;			
		}
		System.out.println("reversed number is: "+reverseNum);
			if(reverseNum==num1)
				System.out.println("The given number "+num1+" is a palindrome");
			else
				System.out.println("The given number "+num1+" is not a palindrome");

	}

}
