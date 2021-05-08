package com.practice.problem04;

import java.util.Scanner;

public class Array153 {
	// 100개의 정수를 입력받을 수 있는 배열을 선언한 후 정수를 차례로 입력 받다가 -1이 입력되면 입력을 중단하고 -1을 제외한 마지막 세 개의 정수를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		int [] array = new int [100];
		int endNum = 0;
		
		for (int i = 0 ; i < array.length ; i++) {
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			if (n != -1) {
				array[i] = n;
				endNum = i;
			}else { break; }
		}
		
		int step = endNum > 3 ? endNum - 2 : 0;
		for (int i = step; i < endNum+1; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
