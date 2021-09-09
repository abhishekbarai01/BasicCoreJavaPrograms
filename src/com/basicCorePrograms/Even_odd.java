package com.basicCorePrograms;

import java.util.Scanner;

//Java Program to Check Whether a Number is Even or Odd

public class Even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Value of num: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is a even number");
		} else {
			System.out.println(num + " is a odd number");
		}
	}
}




