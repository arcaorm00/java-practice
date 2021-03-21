package com.practice.problem03;

public class IterationLoop548 {
//	구구단의 일부를 다음과 같이 출력하는 프로그램을 작성하시오.
//	곱셈의 결과는 오른쪽으로 맞추어 출력을 하고 결과값 사이의 공백은 3칸으로 한다.
//	출력형식 예) 2_*_1_=__2___ (_는 공백을 나타내는 것임)​
	public static void main(String[] args) {
		int GUGU = 5;
		
		for(int i = 1 ; i < GUGU ; i++) {
			for (int j = 1 ; j < 6; j++) {
				String out  = (i*j) > 9 ? (i*j) + "" : " " + (i*j); 
				System.out.print(i + " * " + j + " = " + out + "   ");
			}
			System.out.println();
		}
	}
}
