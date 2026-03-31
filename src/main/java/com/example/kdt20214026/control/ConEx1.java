package com.example.kdt20214026.control;

import java.util.Scanner;
public class ConEx1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력된 수가 짝수인지 홀수인지 출력
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		String output;
		
		output = (num % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println("입력한 숫dl자 " + num + "은 " + output + "입니다.");
	}
}
