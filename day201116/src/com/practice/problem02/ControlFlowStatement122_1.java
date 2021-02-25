package com.practice.problem02;

import java.util.Scanner;

public class ControlFlowStatement122_1 {
	// 년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("윤년 여부를 확인하고자 하는 년도를 입력해주세요: ");
		int year = scan.nextInt();
		scan.close();
		
		String isLeapYear = "평년";
		
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			isLeapYear = "윤년";
		}
		
		System.out.println(isLeapYear);
		
	}
}
