package com.practice.problem02;

import java.util.Scanner;

public class ControlFlowStatement531 {

	/*복싱체급은 몸무게가 
		50.80kg 이하를 Flyweight, 
		61.23kg 이하를 Lightweight, 
		72.57kg 이하를 Middleweight, 
		88.45kg 이하를 Cruiserweight, 
		88.45kg 초과를 Heavyweight
	라고 하자.
	몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오.*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몸무게를 입력하세요: ");
		double weight = scan.nextDouble();
		scan.close();
		
		String result = "";
		if (weight <= 50.80) { result = "Flyweight"; }
		else if (weight <= 61.23) { result = "Lightweight"; }
		else if (weight <= 72.57) { result = "Middleweight"; }
		else if (weight <= 88.45) { result = "Cruiserweight"; }
		else { result = "Heavyweight"; }
		
		System.out.println(result);
	}
}
