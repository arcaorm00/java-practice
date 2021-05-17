package com.practice.problem04;

import java.util.Scanner;

public class Array156 {
	// 세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고 그 때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성하시오.
	// 입력받는 정수는 100개 이하이다.
	public static void getMinMaxNum(int [] array){
		int min = array[0];
		int max = array[0];
		for (int i = 1 ; i < array.length ; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
	public static void main(String[] args) {
		int [] array = new int [100];
		int limit = 100;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < limit; i++) {
			int num = scan.nextInt();
			if (num == 999) {
				break;
			}
			array[i] = num;
		}
		
		scan.close();
		getMinMaxNum(array);
	}
}
