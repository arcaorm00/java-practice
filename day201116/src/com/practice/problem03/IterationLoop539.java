package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop539 {
	// 정수를 계속 입력받다가 100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.
	// (평균은 반올림하여 소수 첫째자리까지 출력한다.)
	public static void main(String[] args) {
		int std = 0;
		int i = 0;
		int total = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(std < 100) {
			
			int input = scan.nextInt();
			std = input;
			total += std;
			i++;
			
		}
		
		scan.close();
		System.out.println(total);
		System.out.println(total / i * 1.0);
	}
}
