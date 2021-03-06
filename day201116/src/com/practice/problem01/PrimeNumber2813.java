package com.practice.problem01;

import java.util.Scanner;

public class PrimeNumber2813 {

	// 소수 구하기
	// 숫자 m과  n을 입력받아 그 사이에 소수가 몇 개나 있는지 구하는 프로그램
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("소수의 수를 구할 자연수 두개를 입력해주세요.");
		String mn = scan.nextLine();
		scan.close();
		
		int m = Integer.parseInt(mn.split(" ")[0]);
		int n = Integer.parseInt(mn.split(" ")[1]);
		
		if (m > n) { int temp = n; n = m; m = temp;}
		
		int cnt = 0;
		
		for (int i = m; i < n; i++) {
			int primeCnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					primeCnt++;
				}
			}
			if(primeCnt == 2) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
