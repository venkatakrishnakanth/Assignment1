/** Find and print the fibanocci series upto given number */
//Programmed by Venkata Krishna Kanth Musunuru

import java.util.Scanner;

public class EigthQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the ceiling number for fibanocci series:");
		int number= S.nextInt(),num1=1, num2 = 1,sum=0;
		System.out.println("The Fibanocci series upto the given limit is:");
		System.out.print(num1+", "+num2);
		while(num2<number){
			sum = num1+num2;
			num1=num2;
			num2 = sum;
			if(num2<=number)
				System.out.print(", "+sum);
		}
	}

}
