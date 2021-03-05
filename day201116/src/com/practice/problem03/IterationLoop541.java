package com.practice.problem03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IterationLoop541 {
//	아래와 같이 나라 이름을 출력하고 숫자를 입력받아 해당하는 나라의 수도를 출력하는 작업을 반복하다가 해당하는 번호 이외의 숫자가 입력되면 "none"라고 출력한 후 종료하는 프로그램을 작성하시오.
//
//	* 각 나라의 수도 : 
//	대한민국 = 서울(Seoul)
//	미국 = 워싱턴(Washington)
//	일본 = 동경(Tokyo)
//	중국 = 북경(Beijing)
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Seoul");
		map.put(2, "Washington");
		map.put(3, "Tokyo");
		map.put(4, "Beijing");
		
		int input = 1;
		String result = "";
		Scanner scan = new Scanner(System.in);
		
		while(map.containsKey(input)) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			input = scan.nextInt();
			System.out.println();
			
			result = map.containsKey(input) ? map.get(input) : "none";
			System.out.println(result);
			System.out.println();
		}
		
		scan.close();
	}
}
