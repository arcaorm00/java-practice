package com.practice.problem01;

import java.util.Scanner;

public class BinaryNumber2814 {

	// 이진수를 입력받아 십진수로 표시하기
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("십진수로 나타낼 이진수를 입력해주세요.");
		String binary = scan.next();
		scan.close();
		
		String [] binaryNums = binary.split("");
		
		int ten = 0;
		int cnt = 0;
		
		for (int i = binaryNums.length-1; i >= 0; i--) {
			int n = Integer.parseInt(binaryNums[i]);
			ten = (int)(ten + n*(Math.pow(2, cnt)));
			cnt++;
		}
		
		System.out.println(ten);
	}
}
