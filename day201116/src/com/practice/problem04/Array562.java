package com.practice.problem04;

import java.util.Scanner;

public class Array562 {
	// 10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		String [] array = input.split(" ");
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for (int i = 1 ; i <= array.length ; i++) {
			if (i % 2 == 0) {
				sumEven += Integer.parseInt(array[i-1]);
			}else {
				sumOdd += Integer.parseInt(array[i-1]);
			}
		}

		System.out.println("sum: " + sumEven);
		System.out.printf("avg: %.1f", (double)sumOdd / Math.ceil(array.length / 2.0));
	}
}
