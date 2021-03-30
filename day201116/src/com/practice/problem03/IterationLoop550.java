package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop550 {
	// 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		for (int i = input ; i > 0 ; i--) {
			for (int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1 ; i < input ; i++) {
			for (int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
