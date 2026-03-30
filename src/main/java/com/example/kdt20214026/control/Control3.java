package com.example.kdt20214026.control;

import java.util.Scanner;
public class Control3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		int max;// 큰 값
		
		/*
		if(num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		*/
		
		// 삼항연산자 = (조건) ? 참 : 거짓;
		max = (num1 > num2) ? num1 : num2;
		
		System.out.println("입력된 값 중 큰 값은 " + max + "입니다.");
	}
}
