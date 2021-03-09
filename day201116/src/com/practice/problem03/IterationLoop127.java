package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop127 {
//	0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
//	(평균은 반올림하여 소수 첫째자리까지 출력한다.)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int tot = 0;
		double avg = 0.0;
		int i = 0;
		
		while(input >= 0 && input <= 100) {
			input = scan.nextInt();
			if (input >= 0 && input <= 100) {
				tot += input;
				i++;
			}
		}
		scan.close();
		
		avg = tot/i;
		System.out.println("total: " + tot);
		System.out.println("average: " + avg);
	}
}
