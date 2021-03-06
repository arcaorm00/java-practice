package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop126 {
//	0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
//	0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
//	홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = -1;
		
		int countOdd = 0;
		int countEven = 0;
		
		while(input != 0) {
			input = scan.nextInt();
			if (input == 0) {
				scan.ioException();
				break;
			}else if (input % 2 == 0) {
				countEven += 1;
			}else if(input % 2 != 0) {
				countOdd += 1;
			}
		}
		scan.close();
		
		System.out.println("odd: " + countOdd);
		System.out.println("even: " + countEven);
	}
}
