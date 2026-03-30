package com.example.kdt20214026.control;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exam3 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 주민번호를 입력 받아 생년월일, 성별, 나이 출력
		System.out.println("주민번호를 입력하세요(990315-1234567): ");
		String jumin = sc.nextLine();
		
		int year = Integer.parseInt(jumin.substring(0, 2)); // 99
		int month = Integer.parseInt(jumin.substring(2, 4)); // 03
		int day = Integer.parseInt(jumin.substring(4, 6)); // 15
		char genderType = jumin.charAt(7);// 성별 코드 1,2,3,4
		
		String gender;
		if(genderType == '1' || genderType == '3') {// 1, 3
			gender = "남자";
		} else if(genderType == '2' || genderType == '4') {// 2, 4
			gender = "여자";
		} else {
			gender = "잘못된 번호를 입력했습니다.";
		}
		
		int fullYear;
		if(genderType == '1' || genderType == '2') {
			fullYear = 1900 + year;
		} else {
			fullYear = 2000 + year;
		}
		
		LocalDate today = LocalDate.now();// 현재 년, 월, 일
		LocalDate birthDate = LocalDate.of(fullYear, month, day);
		int age = Period.between(birthDate, today).getYears();
		int koreanAge = today.getYear() - fullYear + 1;
		
		System.out.println("생년월일: " + fullYear + "년 "+ month + "월 " + day + "일");
		System.out.println("성별: " + gender);
		System.out.println("나이: " + age);
		System.out.println("한국 나이: " + koreanAge);
	}


}
