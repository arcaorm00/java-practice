package com.practice.problem04;

import java.util.Scanner;

public class Array152 {
	// 10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		String [] array = input.split(" ");
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 0 ; i < array.length ; i++) {
			int n = Integer.parseInt(array[i]);
			if (i % 2 != 0) {
				oddSum += n;
			}else {
				evenSum += n;
			}
		}
		
		System.out.println("even: " + evenSum);
		System.out.println("odd: " + oddSum);
	}
}
