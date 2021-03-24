package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop132 {
	// 정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int tot = 0;
		
		for (int i = 1 ; i <= n ; i++) {
			if (i % 5 == 0) {
				tot += i;
			}
		}
		
		System.out.println(tot);
	}
}
