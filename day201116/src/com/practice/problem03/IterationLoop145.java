package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop145 {
	// 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
	//    1
	//  1 2
	//1 2 3
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		for (int i = 1 ; i <= input ; i++) {
			for (int j = i*2 ; j < input*2 ; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k <= i ; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
