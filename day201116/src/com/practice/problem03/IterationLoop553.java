package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop553 {
	// 자연수 n( 3 <= n <= 10) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		String [] alphabet  = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		
		int idx = 0;
		for (int i = input ; i > 0 ; i--) {
			for (int j = 0 ; j < i ; j++) {
				System.out.print(alphabet[idx]);
				idx++;
			}
			System.out.println();
		}
	}
}
