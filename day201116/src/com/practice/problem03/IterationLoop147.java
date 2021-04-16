package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop147 {
	// 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
	//	1 2 3
	//	  4 5
	//	    6
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		int num = 1;
		
		for (int i = 0 ; i < input ; i++) {
			for (int j = 0 ; j < i*2 ; j++) {
				System.out.print(" ");
			}
			for (int k = i ; k < input ; k++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
