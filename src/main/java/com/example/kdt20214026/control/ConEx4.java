package com.example.kdt20214026.control;

import java.util.Scanner;

public class ConEx4 {
	public static void main(String[] args) {
		/* 입력된 수가 1~100 사이 -> "1~100" 출력
		 * 101~200 -> "101~200" 출력
		 * 그 외면 -> "200이상" 출력
		 * -5(음수) -> "유효하지 않는 값입니다" 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		String output;
		
		/*
		if(num > 200) {
			output = "200이상";
		} else {
			if(num > 100) {
				output = "101~200";
			} else {
				output = "1~100";
			}
		}
		*/
		
		if(num <= 0) {
			output = "유효하지 않는 값입니다";
		} else if(num >= 1 && num <= 100) {
			output = "1~100";
		} else if(num >= 101 && num <= 200) {
			output = "101~200";
		} else {
			output = "200이상";
		}
		
		System.out.println(output);
	}


}
