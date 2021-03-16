package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop125 {
	// 정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		for(int i = 1 ; i <= input ; i++) {
			System.out.print(i + " ");
		}
	}
}
