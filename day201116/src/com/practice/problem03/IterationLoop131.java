package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop131 {
	//100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		if (n < m) {
			int temp = m;
			m = n;
			n = temp;
		}
		
		for (int i = m ; i <= n ; i++) {
			System.out.print(i + " ");
		}
	}
}
