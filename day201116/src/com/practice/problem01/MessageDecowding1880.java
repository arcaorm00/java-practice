package com.practice.problem01;

import java.util.Scanner;

public class MessageDecowding1880 {

	// input: 첫 줄에는 복호화 키가 26개의 소문자로 주어지고, 다음 줄에는 암호화 된 문자가 최대 80 문자로 입력된다.
	// output: 암호화 된 문장을 복호화 시켜 원문을 출력한다.
	// ex: 
	// eydbkmiqugjxlvtzpnwohracsf
	// Kifq oua zarxa suar bti yaagrj fa xtfgrj ==> Jump the fence when you seeing me coming
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String keys = scan.nextLine();
		String sentence = scan.nextLine();
		scan.close();
		
		String [] decowd = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String [] cowd = keys.split("");
		
		System.out.println(cowd.length);
		System.out.println(decowd.length);
		
		String [] sen = sentence.split("");
		
		for (int i = 0; i < sen.length; i++) {
			String ch = sen[i];
			int idx = 0;
			for (String s : cowd) {
				if(s.equals(ch)) {
					break;
				}
				idx++;
			}

			if (idx < 26) {
				System.out.print(decowd[idx]);
			}else {
				System.out.print(ch);
			}
			
		}
		
		// 예시가 제대로 된 건지 모르겠음...
		// 위 코드 현재 eydbkmiqugjxlvtzpnwohracsf를 두번 입력하면 abcdefghijklmnopqrstuvwxyz로 복호화 됨
		
	}
}
