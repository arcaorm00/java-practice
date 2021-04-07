package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop141 {
	// 1부터 100까지의 정수 중 한 개를 입력받아 100 보다 작은 배수들을 차례로 출력하다가 10 의 배수가 출력되면 프로그램을 종료하도록 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		int n = 1;
		
		while(true) {
			int output = input * n;
			System.out.print(output + " ");
			n++;
			if (output > 100 || output % 10 == 0) {
				break;
			}
		}
	}
}
