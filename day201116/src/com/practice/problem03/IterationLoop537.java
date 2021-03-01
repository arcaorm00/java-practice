package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop537 {
	// 100 이하의 양의 정수만 입력된다.
	// while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		int i = 1;
		int result = 0;
		
		while(i <= input) {
			result = result + i;
			i++;
		}
		
		System.out.println(result);
	}
}
