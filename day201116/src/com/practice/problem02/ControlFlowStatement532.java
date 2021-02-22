package com.practice.problem02;

import java.util.Scanner;

public class ControlFlowStatement532 {
	// 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해주세요:");
		String input = scan.nextLine();
		
		double a = Double.parseDouble(input.split(" ")[0]);
		double b = Double.parseDouble(input.split(" ")[1]);
		scan.close();
		
		char result = 'C';
		if (a >= 3.0 && b >= 3.0) {
			result = 'B';
		}
		if (a >= 4.0 && b >= 4.0) {
			result = 'A';
		}
		
		System.out.println(result);
	}
}
