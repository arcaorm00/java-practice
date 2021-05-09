package com.practice.problem04;

import java.util.Scanner;

public class Array154 {
	// 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오.
	// ex.) 23.2 39.6 66.4 50.0 45.6 48.0 ==> 45.5
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		String [] array = input.split(" ");
		
		double sum = 0.0;
		int len = array.length;
		
		for (int i = 0; i < len; i++) {
			double weight = Double.parseDouble(array[i]);
			sum += weight;
		}
		
		System.out.printf("%.1f", sum/len);
	}
}
