package com.practice.problem02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControlFlowStatement123 {
	/*
		1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오.
		해당 번호가 없으면 "I don't know."라고 출력한다.
		개-dog
		고양이-cat
		병아리-chick​ 
	 */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "dog"); map.put("2", "cat"); map.put("3", "chick");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Number? ");
		String inputNum = scan.next();
		scan.close();
		
		String result = "I don't know";
		
		result = map.get(inputNum) != null ? map.get(inputNum) : "I don't know";
		
		System.out.println(result);
	}
}
