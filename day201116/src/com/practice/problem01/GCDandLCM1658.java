package com.practice.problem01;

import java.util.Scanner;

public class GCDandLCM1658 {

	// 최대공약수와 최소공배수 구하기
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("최대공약수와 최소공배수를 구할 정수 둘을 입력해주세요.");
		String nm = scan.nextLine();
		
		int n = Integer.parseInt(nm.split(" ")[0]);
		int m = Integer.parseInt(nm.split(" ")[1]);
		
		int gcd = 0;
		
		
		for (int i = 1; i < n; i++) {
			if (n % i == 0 && m % i == 0) {
				gcd = i;
			}
		}
		
		int lcm = n * m / gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		

	}
}
