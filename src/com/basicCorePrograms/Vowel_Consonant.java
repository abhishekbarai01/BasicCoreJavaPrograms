package com.basicCorePrograms;

import java.util.Scanner;

//Java Program to Check Whether an Alphabet is Vowel or Consonant

public class Vowel_Consonant {

	public static void main(String[] args) {
		System.out.println("Enter a character :");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
			System.out.println("Given character is an vowel");
		}else{
			System.out.println("Given character is a consonant");

		}
	      }
	}


	


