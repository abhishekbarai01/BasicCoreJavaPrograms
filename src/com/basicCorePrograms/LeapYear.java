package com.basicCorePrograms;

//Leap Year

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter year in the format of YYYY: ");
		int year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
			System.out.println("Given year is a leap year");
		else
			System.out.println("Given year is Not a leap year");
	}
		
	}




