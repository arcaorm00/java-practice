package com.practice.problem01;

import java.util.Random;
import java.util.TreeSet;

public class SetTest01 {

	public static void main(String[] args) {
		Random rand = new Random();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		while(ts.size() < 6) {
			int num = rand.nextInt(45)+1;
			System.out.println(num);
			ts.add(num);
		}
		
		System.out.println(ts);
	}
}
