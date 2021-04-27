package com.practice.problem04;

import java.util.Scanner;

public class Array558 {
	// 100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		int [] array = new int [100];
		
		int i = 0;
		for (i = 0 ; i < array.length ; i++) {
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			scan.close();
			if (input != 0) {
				array[i] = input;
			}else {
				break;
			}
		}
		
		for (int j = i-1; j >= 0; j--) {
			System.out.print(array[j] + " ");
		}
	}
}
