package com.practice.problem01;

import java.util.ArrayList;
import java.util.Scanner;

public class Divisor1402 {

	// 약수 구하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("약수를 구할 수와 몇 번째 약수를 보고자 하는지 입력해주세요.");
		String mn = scan.nextLine();
		scan.close();
		
		int n = Integer.parseInt(mn.split(" ")[0]);
		int k = Integer.parseInt(mn.split(" ")[1]);
		
		ArrayList<Integer> list = new ArrayList();
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}
		
		try {
			System.out.println(list.get(k-1));
		}catch (Exception e) {
			System.out.println(0);
		}
		
	}
}
