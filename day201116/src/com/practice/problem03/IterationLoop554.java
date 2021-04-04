package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop554 {
	// 자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		int num = 1; 
		String [] alphabet  = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		int alphacnt = 0;
		
		for (int i = 0 ; i < input ; i++) {
			for (int j = input ; j > i ; j--) {
				System.out.print(num + " ");
				num++;
			}
			for (int k = 0 ; k <= i ; k++) {
				System.out.print(alphabet[alphacnt] + " ");
				alphacnt++;
			}
			System.out.println();
		}
	}
}
