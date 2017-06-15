/*** Find the minimum of four numbers **/
// Programmed by Venkata Krishna Kanth Musunuru.

import java.util.Scanner;

public class FirstQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the four numbers to get the minimum number:\n");
		int[] minarray = new int[4];
		
		Scanner S = new Scanner(System.in);
		for(int i=0;i<4;i++){
			minarray[i]= S.nextInt();
		}
		
		if((minarray[0]<=minarray[1])&& (minarray[0]<=minarray[2])&&(minarray[0]<=minarray[3])){
			System.out.println(minarray[0]+" is the mininmum number.");
		}else if((minarray[1]<=minarray[2])&& (minarray[1]<=minarray[3])){
			System.out.println(minarray[1]+" is the mininmum number.");
		}else if(minarray[2]<=minarray[3]){
			System.out.println(minarray[2]+" is the mininmum number.");
		}else{
			System.out.println(minarray[3]+" is the minimum number.");
		}
	}

}
