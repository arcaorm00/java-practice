package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop136 {
	// 한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print(input*i + " ");
		}
	}
}
