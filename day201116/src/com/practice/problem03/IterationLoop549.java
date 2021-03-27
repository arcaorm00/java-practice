package com.practice.problem03;

import java.util.Scanner;

public class IterationLoop549 {
	// 자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int i = 1;
		int tot = 0;
		int cnt = 0;
		
		while(true) {
			tot += i;
			i += 2;
			cnt++;
			if (tot >= n) {
				break;
			}
		}
		
		System.out.println(cnt);
		System.out.println(tot);
	}
}
