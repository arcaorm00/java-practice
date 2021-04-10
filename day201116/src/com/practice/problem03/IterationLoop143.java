package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop143 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		for (int i = 0; i < input; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print(" ");
			}
			for(int k = input*2 ; k > i*2+1 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1 ; i < input ; i++) {
			for (int j = i+1 ; j < input ; j++) {
				System.out.print(" ");
			}
			for (int k = 0 ; k <= i*2 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
