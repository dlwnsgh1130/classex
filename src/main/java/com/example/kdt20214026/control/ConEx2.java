package com.example.kdt20214026.control;

public class ConEx2 {
	public static void main(String[] args) {
		int a = 45, b = 650, c = 1249, max;
		
		/* 큰 값 출력
		if(a > b) {
			if(a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if(b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		*/
		
		// 삼항연산자
		// max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		// max = (a > b) ? a : b;
		// max = (max > c) ? max : c;
		
		max = Math.max(a, Math.max(b, c));
		
		System.out.println("a, b, c 중 큰 값은 " + max);
	}
}
