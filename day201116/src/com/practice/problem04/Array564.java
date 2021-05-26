package com.practice.problem04;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Array564 {
//	영문 대문자를 입력받다가 대문자 이외의 문자가 입력되면 입력을 중단하고
//	영문 대문자들에 대하여 1번 이상 입력된 각 문자와 그 문자의 개수를 사전 순으로 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		String input = "A";
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		while((int)input.charAt(0) >= 65 && (int)input.charAt(0) <= 90) {
			input = scan.nextLine();
			
			if ((int)input.charAt(0) < 65 || (int)input.charAt(0) > 90) { break; }
			
			if (map.get(input) != null) {
				map.put(input, map.get(input) + 1);
			}else {
				map.put(input, 1);
			}
		}
		
		scan.close();
		System.out.println(map);
	}
}
