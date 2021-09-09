package com.basicCorePrograms;

//Java Program to Compute Quotient and Remainder

import java.util.Scanner;

public class Quotient_Remainder {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter Number: ");
		int dividend = sc.nextInt();

		System.out.println(" Please enter Number: ");
		int divisor = sc.nextInt();

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}

	}


