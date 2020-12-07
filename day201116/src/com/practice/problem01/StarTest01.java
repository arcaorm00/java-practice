package com.practice.problem01;

import java.util.Scanner;

public class StarTest01 {

	// 별찍기 예제
	public static void main(String[] args) {
		// 입력 받은 수만큼 별 찍기
		Scanner scan = new Scanner(System.in);
		System.out.print("출력하고자 하는 별의 수를 입력해주세요."); // 5
		int star = scan.nextInt();
		scan.close();
		
		try {
			// *****
			for (int i = 0; i < star; i++) {
				System.out.print("*");
			}
			System.out.println();
			
			System.out.println("====================");
			
			// * ** *** **** *****
			for (int i = 0; i <= star; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("====================");
			
			// ***** **** *** ** *
			for (int i = star; i > 0; i--) {
				for (int j = i; j > 0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("====================");
			
			// * ** *** **** ***** **** *** ** *
			for (int i = 0; i <= star; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = star; i > 0; i--) {
				for (int j = i-1; j > 0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}catch (Exception e) {
			System.out.println("입력 값을 확인해주세요.");
		}
		
	}
}
