package com.practice.problem04;

import java.util.Scanner;

public class Array557 {
	//10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String [] array = input.split(" ");
		scan.close();
		
		System.out.print(array[0] + " ");
		System.out.print(array[3] + " ");
		System.out.print(array[6] + " ");
	}
}
