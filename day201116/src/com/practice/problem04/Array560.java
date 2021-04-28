package com.practice.problem04;

import java.util.Scanner;

public class Array560 {
	// 10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		String [] array = input.split(" ");
		
		int min = Integer.parseInt(array[0]);
		for (int i = 1 ; i < array.length; i++) {
			int num = Integer.parseInt(array[i]);
			if (num < min) {
				min = num;
			}
		}
		
		System.out.println(min);
	}
}
