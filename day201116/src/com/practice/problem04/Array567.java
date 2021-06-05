package com.practice.problem04;

public class Array567 {
//	3행 5열의 배열을 아래 출력 예와 같이 초기화 한 후 출력하는 프로그램을 작성하시오.
//	숫자사이의 공백은 3칸으로하고 각 숫자는 2칸으로 오른쪽에 맞추어 출력한다.
//	 5    8   10    6    4
//	11   20    1   13    2
//	 7    9   14   22    3
	public static void main(String[] args) {
		int [][] array = {{5, 8, 10, 6, 4}, {11, 20, 1, 13, 2}, {7, 9, 14, 22, 3}};
		
		for (int i = 0 ; i < array.length ; i++) {
			int [] subArray = array[i];
			for (int j = 0 ; j < subArray.length ; j++) {
				int num = subArray[j];
				System.out.printf("%2d   ", num);
			}
			System.out.println();
		}
	}
}
