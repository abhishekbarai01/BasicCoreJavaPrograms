package com.basicCorePrograms;

import java.util.Scanner;

//Java Program to Swap Two Numbers

public class Swap_two_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Value of num1: ");
		int num1  = sc.nextInt();

		System.out.println("Value of num2: ");
		int num2 = sc.nextInt();

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
			
			System.out.println(" Value of num1 after swap: " + num1);
			System.out.println(" Value of num2 after swap: " + num2);
		}

	}


