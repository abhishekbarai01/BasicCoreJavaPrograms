package com.basicCorePrograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No of times you want to Flips coin");
        double a = scan.nextInt();

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < a; i++ ) {
            int coin = (int) Math.floor(Math.random() * 10) % 2;

            if (coin == 1){
                heads +=1;
                }
            else {
                tails +=1;
                }
            }
            double headpercentage = (heads / a)*100;
            double tailpercentage = 100 - headpercentage;

            System.out.println("Number of Head count: " + heads);
            System.out.println("Number of Tail count: " + tails);

            System.out.println("Head percent: " + headpercentage);
            System.out.println("Tail percent: " + tailpercentage);
        }
    }



