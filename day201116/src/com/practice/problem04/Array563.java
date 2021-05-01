package com.practice.problem04;

import java.util.Arrays;
import java.util.Scanner;

public class Array563 {
	
	public static String [] array;
	
	public static void sortByLoop(String [] array) {
		for (int i = 0 ; i < array.length ; i++) {
			for (int j = 0 ; j < array.length ; j++) {
				if (Integer.parseInt(array[i]) > Integer.parseInt(array[j])) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	// 10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		array = input.split(" ");
		
		sortByLoop(array);
	}
}
