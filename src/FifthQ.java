/*** Check whether a given number is armstrong number or not */
//Programmed by Venkata Krishna Kanth Musunuru

import java.util.Scanner;

public class FifthQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the test number for Armstrong number:");//1634 is an example of armstrong number.
		int number= S.nextInt();
		int num1=number,length=0, num2=number;
		
		while(num1!=0){
			num1=num1/10;
			length++;
		}
		for(int i=0; i< length;i++){
			num1 = num1+ (int) Math.pow(number%10, length);
			System.out.print(number%10+"^"+length+"+ ");
			number=number/10;
		}
		System.out.print("= "+num1+"\n");
		if(num1==num2)
			System.out.println("The given number "+num2+" is an armstrong number.");
		else
			System.out.println("The given number "+num2+" is not an armstrong number.");
	}

}
