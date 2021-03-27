package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop135 {
	// 두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.
	// (평균은 반올림하여 소수 첫째자리까지 출력한다.)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int n = Integer.parseInt(input.split(" ")[0]);
		int m = Integer.parseInt(input.split(" ")[1]);
		scan.close();
		
		int tot = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i = n ; i <= m ; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				tot += i;
				count++;
			}
		}
		
		avg = tot / (double)count;
		System.out.println("total: " + tot);
		System.out.printf("average: %.1f", avg);
	}
}
