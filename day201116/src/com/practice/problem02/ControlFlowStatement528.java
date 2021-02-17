package com.practice.problem02;

import java.util.Scanner;

public class ControlFlowStatement528 {

	// 정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 “minus” 라고 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		System.out.print("정수를 입력해주세요: ");
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		
		if (inputNum < 0) {
			System.out.println("minus");
		}

	}

}
