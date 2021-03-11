package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop128 {
	// 0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = -1;
		int count = 0;
		
		while(input != 0) {
			input = scan.nextInt();
			if (input % 3 != 0 && input % 5 != 0) {
				count++;
			}
		}
		scan.close();
		System.out.println(count);
		
	}
}
