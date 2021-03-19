package com.practice.problem03;

public class IterationLoop547 {
	// 아래와 같이 출력되는 프로그램을 작성하시오.
	public static void main(String[] args) {
		for (int i = 2 ; i < 7 ; i++) {
			for (int j = i ; j < i+5 ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
