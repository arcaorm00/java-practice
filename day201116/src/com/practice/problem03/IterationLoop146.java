package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop146 {
	// 자연수 n(n≤6)을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
	//	A B C
	//	D E 0
	//	F 1 2
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		String [] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
		int alpha = 0;
		
		int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int num = 0;
		
		for (int i = 0 ; i < input ; i++) {
			for (int j = i ; j < input ; j++) {
				System.out.print(alphabets[alpha] + " ");
				alpha++;
			}
			for (int k = 0 ; k < i ; k++) {
				System.out.print(numbers[num] + " ");
				num++;
			}
			System.out.println();
			
			
		}
	}
}
