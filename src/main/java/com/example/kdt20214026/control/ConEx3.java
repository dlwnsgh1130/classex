package com.example.kdt20214026.control;

import java.util.Scanner;

public class ConEx3 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		// 1,3 - 남자, 2,4 - 여자
		System.out.println("남자면 1,3, 여자면 2,4를 입력하세요: ");
		int gender = sc.nextInt();
		String output;
		
		/*
		OR 연산자: A조건 혹은 B조건만 만족해도 true
		if(gender == 1 || gender == 3) {
			output = "남자";
		} else {
			output = "여자";
		}
		*/
		
		// 예외 범위 처리
		// && 연산자: A조건, B조건 모두 만족해야 true
		if(gender >=1 && gender <=4) {// 1~4
			output = (gender == 1 || gender == 3) ? "남자" : "여자";
			System.out.println("당신은 " + output);
		} else {
			System.out.println("정해진 숫자만 입력하세요.");
		}
		
	}


}
