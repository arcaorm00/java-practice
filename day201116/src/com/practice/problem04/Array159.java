package com.practice.problem04;

import java.util.Scanner;

public class Array159 {
	private static void sortScores(int [] array) {
		for (int i = 0; i < array.length ; i++) {
			for (int j = i+1 ; j < array.length ; j++) {
				if (array[j] > array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i] + " ");
		}
	}
	// 20 이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int [] array = new int [num];
		
		for (int i = 0 ; i < num ; i++) {
			int score = scan.nextInt();
			array[i] = score;
		}
		
		scan.close();
		
		sortScores(array);
	}
}
