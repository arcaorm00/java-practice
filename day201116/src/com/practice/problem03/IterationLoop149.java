package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop149 {
	// 자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오.
	// 10 미만의 홀수만 출력하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		int out = 1;
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				System.out.print(out + " ");
				out = out >= 9 ? 1 : out + 2;
			}
			System.out.println();
		}
	}
}
