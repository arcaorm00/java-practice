package com.practice.problem02;

import java.util.Scanner;

public class ControlFlowStatement124 {
	// 1~12사이의 정수를 입력받아 평년의 경우 입력받은 월을 입력받아 평년의 경우 해당 월의 날수를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		int [] lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("마지막 날을 출력할 월을 입력해주세요.");
		int month = scan.nextInt();
		scan.close();
		
		System.out.println(lastDay[month-1]);
	}
}
