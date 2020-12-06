package com.practice.problem01;

import java.util.Scanner;

public class NumberSquare2046 {

//	http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=1316&sca=20
//	정사각형의 한 변의 길이 n과 종류 m을 입력받은 후 다음과 같은 정사각형 형태로 출력하는 프로그램을 작성하시오.
//	< 처리조건 >
//	종류 2번의 경우 숫자의 진행 순서는 처음에 왼쪽에서 오른쪽으로 너비 n만큼 진행 한 후 방향을 바꾸어서 이를 반복한다.

//	input: 정사각형 한 변의 길이 n(n의 범위는 100 이하의 정수)과 종류 m(m은 1부터 3사이의 정수)을 입력받는다.
//	output: 위에서 언급한 3가지 종류를 입력에서 한 변의 길이 n과 종류 m에 맞춰서 출력한다. 숫자 사이는 공백으로 구분하여 출력한다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("출력할 정사각형의 변의 길이와 종류를 입력해주세요.");
		String nm = scan.nextLine();
		scan.close();
		
		int n = Integer.parseInt(nm.split(" ")[0]);
		int m = Integer.parseInt(nm.split(" ")[1]);
		
		int [][] arr = new int [n][n];
		
		switch(m) { 
			case 1:
				
				int num = 1;
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n; j++) {
						System.out.print(num + " ");
						if (j == n) { System.out.println(); num++; }
					}
				}; break;
				
			case 2:
				
				for (int i = 0; i < n; i++) {
					if (i % 2 == 0) {
						for (int j = 0; j < n; j++) {
							arr[i][j] = j+1;
						}
					}else {
						for (int j = n-1; j >= 0; j--) {
							arr[i][j] = (j-(n)) * -1; 
						}
					}
				}
				
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}; break;
				
			case 3:
				
				for (int i = 0; i < n; i++) {
					num = i+1;
					for(int j = 0; j < n; j++) {
						arr[j][i] = num;
						num = num + i + 1;
					}
				}
				for (int i = 0; i < n; i++) {
					for (int x : arr[i]) {
						System.out.print(x + " ");
					}
					System.out.println();
				}
				; break;
				
		} 
	}
}
