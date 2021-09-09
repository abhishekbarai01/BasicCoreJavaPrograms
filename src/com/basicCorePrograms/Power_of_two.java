package com.basicCorePrograms;

//Power of 2
import java.util.Scanner;

public class Power_of_two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter Number: ");
		int n = sc.nextInt();

		int i = 0;                // count from 0 to N
		int powerOfTwo = 1;       // the ith power of two

		// repeat until i equals n
		while (i <= n) {
			System.out.println(powerOfTwo);   // print out the power of two
			powerOfTwo = 2 * powerOfTwo;                // double to get the next one
			i = i + 1;

		}
		}
	}




