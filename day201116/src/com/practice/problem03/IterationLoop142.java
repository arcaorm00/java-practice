package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop142 {
	// 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = input; i > 1; i--) {
			for (int j = i; j > 1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	
