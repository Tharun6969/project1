package com.assignment1;


import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the number to reverse");
		int num = input.nextInt();
		input.close();
		int revNumber=0;
		while(num!=0) {
			int digit = num%10;
			revNumber=revNumber*10+digit;
			num=num/10;
					
		}
		System.out.print("The reversed is" + revNumber);
	}

}
