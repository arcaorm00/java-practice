package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop148 {
	// 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
	//	#
	//	# #
	//	# # #
	//	  # #
	//	    #
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		for (int i = 1 ; i < input*2 ; i++) {
			for (int j = input ; j < i ; j++) {
				System.out.print("  ");
			}
			for (int k = i > input ? (i - input + (i-input)) : 0 ; k < i ; k++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}
