package com.practice.problem02;

import java.util.Scanner;

public class ControlFlowStatement632 {
	// 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		int x = Integer.parseInt(input.split(" ")[0]);
		int y = Integer.parseInt(input.split(" ")[1]);
		int z = Integer.parseInt(input.split(" ")[2]);
		
		int min = (x > y) ? y : x;
		min = (z > min) ? min : z;
		
		System.out.println("최소값은 " + min);
	}
}
