package com.practice.problem01;

import java.util.Scanner;

public class Gugudan1291 {
	
//	원하는 구구단의 범위를 입력받아 해당 구간의 구구단을 출력하는 프로그램을 작성하시오.
//	<처리조건>
//	(1) 구간의 처음과 끝을 입력받는다. 
//	(2) 입력된 구간은 반드시 처음 입력 값이 끝의 입력 값보다 작아야 하는 것은 아니다.
//	    즉 입력된 구간의 범위는 증가하거나 감소하는 순서 그대로 출력되어야 한다.​ 
	
//	구구단의 시작 범위 s,와 끝 범위 e를 입력받는다.(s와 e는 2부터 9사이의 정수) 
//	하나의 결과가 출력되면 프로그램을 종료한다.
	
//	4 * 1 =  4   3 * 1 =  3
//	4 * 2 =  8   3 * 2 =  6
//	4 * 3 = 12   3 * 3 =  9
//	4 * 4 = 16   3 * 4 = 12
//	4 * 5 = 20   3 * 5 = 15
//	4 * 6 = 24   3 * 6 = 18
//	4 * 7 = 28   3 * 7 = 21
//	4 * 8 = 32   3 * 8 = 24
//	4 * 9 = 36   3 * 9 = 27
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단으로 출력하고자 하는 2와 9 사이의 정수 두 수를 입력하시오.");
		String nm = scan.nextLine();
		
		nm = nm.trim();
		nm = nm.replaceAll(" ", "");
		int n = Integer.parseInt(nm.split("")[0]);
		int m = Integer.parseInt(nm.split("")[1]);
		
		if(n > m) {
			for(int i = 1; i < 10; i++) {
				for(int j = n; j >= m; j--) {
					String result = Integer.toString(j*i);
					if(result.length() < 2) {
						result = " " + Integer.toString(j*i);
					}
					System.out.print(j + " * " + i + " = " + result + "\t");
				}
				System.out.println("\n");
			}
		}else {
			for(int i = 1; i < 10; i++) {
				for(int j = n; j <= m; j++) {
					String result = Integer.toString(j*i);
					if(result.length() < 2) {
						result = " " + Integer.toString(j*i);
					}
					System.out.print(j + " * " + i + " = " + result + "\t");
				}
				System.out.println("\n");
			}
		}
	}
}
