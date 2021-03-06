package com.practice.problem01;

import java.util.Scanner;

public class FindingString2514 {

//	주어진 문자열에서 연속 3개의 문자가 IOI 이거나 KOI인 문자열이 각각 몇 개 있는지 찾는 프로그램을 작성하라.
//	문자열은 알파벳의 대문자로만 이루어진다. 
//	예를 들어 "KOIOIOI"라는 문자열은 KOI 1개 , IOI 2개가 포함되어있다.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		
		String [] inputSplit = input.split("");
		
		int cntKOI = 0;
		int cntIOI = 0;
		
		int cnt = 0;
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < inputSplit.length; i++) {
			sb.append(inputSplit[i]);
			cnt++;
			if(sb.toString().equals("KOI")) {
				cntKOI += 1;
			}else if (sb.toString().equals("IOI")) {
				cntIOI += 1;
			}
			if (cnt == 3) {
				i -= 2;
				cnt = 0;
				sb.delete(0, 3);
			}			
		}
		
		System.out.println("KOI: "+cntKOI);
		System.out.println("IOI: "+cntIOI);
	}
}
