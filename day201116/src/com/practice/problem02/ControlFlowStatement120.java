package com.practice.problem02;

import java.util.Scanner;

public class ControlFlowStatement120 {
	// 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("차를 구할 두 수를 입력해주세요: ");
		
		String input = scan.nextLine();
		
		int x = Integer.parseInt(input.split(" ")[0]);
		int y = Integer.parseInt(input.split(" ")[1]);
		
		System.out.println(Math.abs(x-y));
	}
}
