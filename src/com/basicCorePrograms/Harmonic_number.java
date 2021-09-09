package com.basicCorePrograms;

import java.util.Scanner;

public class Harmonic_number {
	public static void main(String[] args) {
		double num,iteration;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextDouble();
		for( iteration=1;iteration<=num;iteration++)
		{
			sum=sum+(1/iteration);
		}
		System.out.println("Harmonic value = "+sum);
	}
}
