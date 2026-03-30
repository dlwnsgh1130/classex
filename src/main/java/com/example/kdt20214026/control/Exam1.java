package com.example.kdt20214026.control;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		/*
		 * 이름, 국어, 영어, 수학 점수를 입력받아
		 * 총점(total), 평균(avg), 등급(grade: A, B, C, D, F) 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		System.out.println("국어 점수 입력: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력: ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력: ");
		int math = sc.nextInt();
		// 총점
		int total = kor + eng + math;
		// 평균
		double avg = (double) total / 3;
		// 학점
		String grade;
		
		if(avg >= 90) {
			grade = "A";
		} else if(avg >= 80 && avg <=89) {
			grade = "B";
		} else if(avg >= 70 && avg <=79) {
			grade = "C";
		} else if(avg >= 60 && avg <=69) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.printf("=== \n이름:%s\n 총점:%d\n 평균:%.2f\n 학점:%s\n", name, total,avg, grade);
		
	}


}
