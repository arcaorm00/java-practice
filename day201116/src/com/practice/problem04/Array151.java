package com.practice.problem04;

import java.util.Scanner;

public class Array151 {
	// 5개의 정수를 입력받은 후 첫 번째 세 번째 다섯 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		String [] array = input.split(" ");
		
		int sum = 0;
		
		for (int i = 0 ; i < array.length ; i++) {
			int n = Integer.parseInt(array[i]);
			if (n % 2 != 0) {
				sum += n;
			}
		}
		
		System.out.println(sum);
	}
}
