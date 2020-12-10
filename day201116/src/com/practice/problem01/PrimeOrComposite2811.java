package com.practice.problem01;

import java.util.Scanner;

public class PrimeOrComposite2811 {

	// 소수인지 합성수인지를 구분하는 프로그램
	// 소수(Prime number): 1 보다 큰 자연수 중 1과 자기 자신만을 약수로 갖는 수
	// 합성수(Composite number): 소수가 아닌 자연수
	// 숫자 5개를 입력받아 해당 수가 소수인지 합성수인지를 구분하도록 한다.
	// ex: 3 10 1 55 127 ==> P C O C P
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("소수와 합성수를 구분할 수 5개를 입력주세요.");
		String input = scan.nextLine();
		scan.close();
		
		int first = Integer.parseInt(input.split(" ")[0]);
		int second = Integer.parseInt(input.split(" ")[1]);
		int third = Integer.parseInt(input.split(" ")[2]);
		int fourth = Integer.parseInt(input.split(" ")[3]);
		int fifth = Integer.parseInt(input.split(" ")[4]);
		
		int [] arr = {first, second, third, fourth, fifth};
		
		for (int num : arr) {
			int cnt = 0;
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				System.out.println("PRIME NUMBER");
			}else if (cnt == 1) {
				System.out.println("NUMBER ONE");
			}else {
				System.out.println("COMPOSITE NUMBER");
			}
		}
	}
}
