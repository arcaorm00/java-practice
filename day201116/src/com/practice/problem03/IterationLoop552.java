package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop552 {
	// 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		for (int i = 0; i < input; i++) {
			for (int k = 0 ; k < i ; k++) {
				System.out.print(" ");
			}
			for (int j = input*2 ; j > (i*2+1) ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
