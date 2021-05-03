package com.practice.problem04;

import java.util.Scanner;

public class Array150 {
	// 10개의 문자를 입력받아 마지막으로 입력받은 문자부터 첫 번째 입력받은 문자까지 차례로 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		String [] array = input.split(" ");
		
		for (int i = array.length-1 ; i >= 0 ; i--) {
			System.out.print(array[i] + " ");
		}
	}
}
