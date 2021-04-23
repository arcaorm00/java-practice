package com.practice.problem04;

import java.util.Scanner;

public class Array555 {
	// 문자 10개를 저장할 수 있는 배열을 만들고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] array = new String [10];
		
		for (int i = 0; i < 10; i++) {
			
			String input = scan.next();
			array[i] = input;
			
		}
		scan.close();
		for (int i = 0; i < array.length ; i++) {
			System.out.print(array[i]);
		}
		
		
	}
}
