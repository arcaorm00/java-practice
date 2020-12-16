package com.practice.problem01;

import java.util.Scanner;

public class BowlTest2604 {

//	그릇을 바닥에 놓았을 때 그 높이는 10cm 이다. 
//	그런데 두 개의 그릇을 같은 방향으로 포개면 그 높이는 5cm만 증가된다. 
//	만일 그릇이 서로 반대방향으로 쌓이면 높이는 그릇만큼, 즉 10cm 늘어난다. 
//	그릇을 괄호 기호로 나타내어 설명해보자. 편의상 그릇이 쌓여지는 방향은 왼쪽에서 오른쪽이라고 가정한다. 
//	그림에서 ‘(’은 그릇이 바닥에 바로 놓인 상태를 나타내며, ‘)’은 그릇이 거꾸로 놓인 상태를 나타낸다.
//
//	만일 그릇이 포개진 모양이 (((( 와 같다면 전체의 높이는 25cm가 된다. 
//	왜냐하면 처음 바닥에 있는 그릇의 높이가 10cm이고 
//	이후 같은 방향으로 3개의 그릇이 포개져 있으므로 늘어난 높이는 5+5+5=15 이기 때문이다. 
//	()() 와 같은 경우라면 그 높이는 10*4=40cm가 된다.
	
//	input: 입력파일의 첫 줄에는 괄호문자로만 이루어진 문자열이 주어진다.
//	입력 문자열에서 열린 괄호 ‘(’은 바로 놓인 그릇 닫힌 괄호 ‘)’은 거꾸로 놓인 그릇을 나타난다. 
//	문자열의 길이는 3이상 50 이하이다. (ex.)
	
//	out: 여러분은 그릇 방향이 괄호 문자로 표시된 문자열을 읽어서 그 최종의 높이를 정수로 출력해야 한다.
//	ex) (((( ==> 25 / ()()()))( ==> 80
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("계산할 그릇을 표시해주세요");
		String bowls = scan.next();
		scan.close();
		
		String [] bowl = bowls.split("");
		String lastBowl = "";
		int height = 0;
		
		for(int i = 0; i < bowl.length; i++) {
			if (i == 0 || !bowl[i].equals(lastBowl)) {
				height += 10;
			}else {
				height += 5;
			}
			
			lastBowl = bowl[i];
		}
		
		System.out.println(height + "cm");
	}
}
