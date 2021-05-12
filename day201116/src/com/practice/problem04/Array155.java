package com.practice.problem04;

import java.util.Arrays;
import java.util.Scanner;


public class Array155 {
//	6개의 문자배열을 만들고 {'J', 'U', 'N', 'G', 'O', 'L'} 으로 초기화 한 후 문자 한 개를 입력받아 배열에서의 위치를 출력하는 프로그램을 작성하시오.
//	첫 번째 위치는 0번이며 배열에 없는 문자가 입력되면 "none" 라는 메시지를 출력하고 끝내는 프로그램을 작성하시오.
	public static void main(String[] args) {
		String [] array = {"J", "U", "N", "G", "O", "L"};
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		
		int idx = Arrays.asList(array).indexOf(s);
		
		System.out.println(idx == -1 ? "none" : idx);
	}
}
