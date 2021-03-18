package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop546 {
//	10 이하의 과목수 n이 주어진다.
//	정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고 
//	평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.
//	평균은 반올림하여 소수 첫째자리까지 출력한다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int countSubject = scan.nextInt();
//		String input = scan.nextLine();
//		Scanner.nextInt 메소드는 사용자 입력의 가장 마지막 개행문자(엔터, newline)를 제거하지 않음
//		개행문자(엔터) 전까지만 숫자로 입력 받습니다.
//		개행문자(엔터)는 다음에 호출된 Scanner.nextLine( ) 메소드의 입력으로 처리되서 문제기 발생합니다.

		int countSubject = scan.nextInt();
		scan.nextLine();
		String input = scan.nextLine();
		String [] inputGrades = input.split(" ");
		scan.close();
		int tot = 0;
		
		for(String gradeString : inputGrades) {
			int grade = Integer.parseInt(gradeString);
			tot += grade;
		}
		
		double avg = tot / (double)countSubject;
		System.out.println(avg);
		if (avg >= 80) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}
}
