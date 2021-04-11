package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop144 {
	// input: 3
	//    *
	//  ***
	//*****
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		for(int i = 1 ; i <= input ; i++) {
			for (int j = i*2 ; j < input*2 ; j++ ) {
				System.out.print(" ");
			}
			for(int k = 1 ; k < i*2 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
