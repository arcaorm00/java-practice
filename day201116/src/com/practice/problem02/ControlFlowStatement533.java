package com.practice.problem02;

import java.util.Scanner;

public class ControlFlowStatement533 {
	// 남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
	// 성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성별(F/M)과 나이를 입력해주세요.");
		String input = scan.nextLine();
		scan.close();
		
		String sex = input.split(" ")[0].toUpperCase();
		int age = Integer.parseInt(input.split(" ")[1]);
		
		switch(sex) {
		case "F":
			if (age >= 18) {System.out.println("WOMAN");}
			else {System.out.println("GIRL");}
			;
			break;
		case "M":
			if (age >= 18) {System.out.println("MAN");}
			else {System.out.println("BOY");}
		}
	}
}
