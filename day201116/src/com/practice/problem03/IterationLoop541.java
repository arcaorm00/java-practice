package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop541 {
	//문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char input = scan.next().charAt(0);
		scan.close();
		
		for(int i = 0; i < 20 ; i++) {
			System.out.print(input);
		}
	}
}
