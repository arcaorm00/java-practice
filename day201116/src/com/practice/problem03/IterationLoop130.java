package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop130 {
	// 10 이하의 자연수 n을 입력받아 "JUNGOL​"을 n번 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("JUNGOL");
		}
	}
}
