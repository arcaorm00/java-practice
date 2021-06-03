package com.practice.problem04;

import java.util.Scanner;

public class Array566 {
//	100 미만의 자연수를 입력받아 첫 번째 항은 100으로 두 번째 항은 입력받은 수로 초기화하고 
//	다음 항부터는 전전항에서 전항을 뺀 수로 채워나가는 수열을 작성하여 그 수가 음수가 나올 때까지 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		while(input < 1 || input > 99) {
			input = scan.nextInt();
		}
		
		scan.close();
		
		int a = 100;
		int b = input;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		while (b > -1) {
			int temp = ( a - b );
			a = b;
			b = temp;
			System.out.print(temp + " ");
		}
		
		
	}
}
