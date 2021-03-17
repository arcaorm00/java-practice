package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop545 {
	// 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputs = scan.nextLine();
		String [] arr = inputs.split(" ");
		scan.close();
		
		int countFive = 0;
		int countThree = 0;
		
		for (String input : arr) {
			int i = Integer.parseInt(input);
			if (i % 5 == 0) {
				countFive++;
			}
			if (i % 3 == 0) {
				countThree++;
			}
		}
		
		System.out.println("Multiples of 5: " + countFive);
		System.out.println("Multiples of 3: " + countThree);
	}
}
