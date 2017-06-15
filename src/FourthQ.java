/*** Print reverse of a number */
//Programmed by Venkata Krishna Kanth Musunuru

import java.util.Scanner;

public class FourthQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int number = S.nextInt();
		while(number!=0){
			System.out.print(number%10);
			number = number/10;
		}
	}

}
