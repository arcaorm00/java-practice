package com.practice.problem04;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Array565 {
//	입력받다가 0 이 입력되면 마지막에 입력된 0 을 제외하고 
//	그 때까지 입력된 정수의 십의 자리 숫자가 각각 몇 개인지 
//	작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)
	public static void main(String[] args) {
		int input = -1;
		Scanner scan = new Scanner(System.in);
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		while(true) {
			input = scan.nextInt();
			
			if (input == 0) { break; }
			
			int key = input / 10;
			map.put(key, map.get(key) == null ? 1 : map.get(key) + 1);
		}
		
		scan.close();
		System.out.println(map);
		
	}
}
