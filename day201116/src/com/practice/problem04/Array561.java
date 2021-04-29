package com.practice.problem04;

import java.util.Scanner;

public class Array561 {
	// 10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
	// (입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		String [] array = input.split(" ");
		
		int max = 0;
		int min = 10000;
		for (int i = 1 ; i < array.length; i++) {
			int num = Integer.parseInt(array[i]);
			if (num >= 100 && num < min) {
				min = num;
			}
			if (num < 100 && num > max) {
				max = num;
			}
		}
		
		System.out.println(min == 10000 ? 100 : min);
		System.out.println(max == 0 ? 100 : max);
	}
}
