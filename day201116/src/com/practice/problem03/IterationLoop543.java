package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop543 {
	// 하나의 정수를 입력받아 1부터 입력받은 정수까지의 짝수를 차례대로 출력하는 프로그램을 작성하시오.
	// 입력되는 정수는 50이하이다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
