package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop137 {
	// 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		int n = Integer.parseInt(input.split(" ")[0]);
		int m = Integer.parseInt(input.split(" ")[1]);
		
		for (int i = 1 ; i <= n ; i++) {
			for (int j = 1 ; j <= m ; j++) {
				System.out.print(j*i + " ");
			}
			System.out.println();
		}
	}
}
