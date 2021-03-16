package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop544 {
	// 100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		int tot = 0;
		
		for (int i = input ; i <= 100 ; i++) {
			tot += i;
		}
		
		System.out.println(tot);
	}
}
