package com.practice.problem04;

import java.util.Scanner;

public class Array157 {
	// 100 개 이하의 정수를 입력받다가 0 이 입력되면 그 때까지 입력된 정수 중 5의 배수의 개수와 합계 평균을 출력하는 프로그램을 작성하시오.
	// 평균은 소수점 이하 1자리까지 출력한다.
	public static void main(String[] args) {
		int limit = 100;
		Scanner scan = new Scanner(System.in);
		
		int multi5 = 0;
		int sum = 0;
		
		for (int i = 0; i < limit; i++) {
			int num = scan.nextInt();
			if (num == 0) {
				break;
			}
			
			if (num % 5 == 0) {
				multi5++;
				sum += num;
			}
		}
		
		scan.close();
		
		System.out.println("Multiples of 5: " + multi5);
		System.out.println("sum: " + sum);
		System.out.printf("avg: %.1f", (double)sum / multi5);
	}
}
